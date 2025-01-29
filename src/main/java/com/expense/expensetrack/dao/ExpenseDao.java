package com.expense.expensetrack.dao;

import com.expense.expensetrack.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: shh
 * @createTime: 2025/1/1816:22
 */
@Repository
public interface ExpenseDao extends JpaRepository<Expense, Long> {

}
