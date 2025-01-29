package com.expense.expensetrack.dto;

import com.expense.expensetrack.entity.Category;
import com.expense.expensetrack.entity.Expense;
import com.expense.expensetrack.entity.User;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author: shh
 * @createTime: 2025/1/1913:14
 *
 * @Entity: 有这个就需要 id
 */

@Data
public class ExpenseDTO extends Expense {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    private User user;

    private Category category;

//    @ManyToOne
//    @JoinColumn(name = "user_id", nullable = false)
//    private User user;
//
//    @ManyToOne
//    @JoinColumn(name = "category_id", nullable = false)
//    private Category category;
}
