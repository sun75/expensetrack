package com.expense.expensetrack.controller;

import com.expense.expensetrack.dto.ExpenseDTO;
import com.expense.expensetrack.entity.Expense;
import com.expense.expensetrack.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author: shh
 * @createTime: 2025/1/1816:34
 */
@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @GetMapping("/getExpenses")
    public ResponseEntity<List<Expense>> getExpenses() {
        List<Expense> expenses = expenseService.getAllExpenseList();
        return ResponseEntity.ok(expenses);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<Expense>> getExpenses(@PathVariable Long userId) {
        List<Expense> expenses = expenseService.getAllExpenses(userId);
        return ResponseEntity.ok(expenses);
    }

    @PostMapping("/createExpense")
    public ResponseEntity<Expense> createExpense(@RequestBody Expense expense) {
        Expense savedExpense = expenseService.createExpense(expense);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedExpense);
    }

    @PostMapping("/createExpenseDTO")
    public ResponseEntity<Expense> createExpenseDTO(@RequestBody ExpenseDTO expenseDTO) {
        Expense savedExpense = expenseService.createExpenseDTO(expenseDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedExpense);
    }

    @PostMapping("/addExpense")
    public ResponseEntity<Expense> addExpense(@RequestBody ExpenseDTO expenseDTO) {
        Expense expense = expenseService.createExpenseDTO(expenseDTO);
        return ResponseEntity.ok(expense);
    }
}

