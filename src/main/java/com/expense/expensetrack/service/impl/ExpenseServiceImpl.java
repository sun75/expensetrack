package com.expense.expensetrack.service.impl;

import com.expense.expensetrack.dao.ExpenseDao;
import com.expense.expensetrack.dao.UserCateExpRelationDao;
import com.expense.expensetrack.dto.ExpenseDTO;
import com.expense.expensetrack.entity.Expense;
import com.expense.expensetrack.entity.UserCateExpRelation;
import com.expense.expensetrack.service.ExpenseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author: shh
 * @createTime: 2025/1/1816:30
 */
@Slf4j
@Service
public class ExpenseServiceImpl implements ExpenseService {
    @Autowired
    private ExpenseDao expenseDao;

    @Autowired
    private UserCateExpRelationDao userCateExpRelationDao;

    @Override
    public List<Expense> getAllExpenseList() {
        return expenseDao.findAll();
    }

    @Override
    public List<Expense> getAllExpenses(Long userId) {
        return expenseDao.findAll();
    }

    @Override
    public Expense createExpense(Expense expense) {
        return expenseDao.save(expense);
    }

    @Transactional
    @Override
    public Expense createExpenseDTO(ExpenseDTO expenseDTO) {
        // Save Expense to database
        Expense expense = new Expense();
        BeanUtils.copyProperties(expenseDTO, expense);
//        expense.setAmount(expenseDTO.getAmount());
//        expense.setDescription(expenseDTO.getDescription());
//        expense.setDate(expenseDTO.getDate());
//        expense.setCreatedAt(LocalDateTime.now());

        Expense savedExpense = expenseDao.save(expense);

        // Save UserCateExpRelation to database
        UserCateExpRelation relation = new UserCateExpRelation();
        if(expenseDTO.getUser() == null){
            relation.setUserId(1L);
        }else{
            relation.setUserId(expenseDTO.getUser().getId());

        }
        if(expenseDTO.getCategory() == null){
            relation.setCategoryId(1L);
        }else{
            relation.setCategoryId(expenseDTO.getCategory().getId());
        }
        relation.setExpenseId(savedExpense.getId());

        userCateExpRelationDao.save(relation);

        return savedExpense;
    }
}

