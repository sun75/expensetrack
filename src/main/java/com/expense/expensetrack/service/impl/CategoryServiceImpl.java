package com.expense.expensetrack.service.impl;

import com.expense.expensetrack.dao.CategoryDao;
import com.expense.expensetrack.entity.Category;
import com.expense.expensetrack.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: shh
 * @createTime: 2025/1/1820:29
 */
@Slf4j
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;

    @Override
    public List<Category> getAllCategories(){
        return categoryDao.findAll();
    }

}
