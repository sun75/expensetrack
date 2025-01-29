package com.expense.expensetrack.service;

import com.expense.expensetrack.dto.ExpenseDTO;
import com.expense.expensetrack.entity.Expense;
import java.util.List;

/**
 * @author: shh
 * @createTime: 2025/1/1822:57
 */
public interface ExpenseService {
    List<Expense> getAllExpenseList();
    List<Expense> getAllExpenses(Long userId);
    Expense createExpense(Expense expense);
    Expense createExpenseDTO(ExpenseDTO expenseDTO);
}
