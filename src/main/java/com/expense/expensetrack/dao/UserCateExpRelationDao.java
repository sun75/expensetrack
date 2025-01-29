package com.expense.expensetrack.dao;

import com.expense.expensetrack.entity.UserCateExpRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCateExpRelationDao extends JpaRepository<UserCateExpRelation, Long> {
}
