package com.expense.expensetrack.service.impl;

import com.expense.expensetrack.dao.UserDao;
import com.expense.expensetrack.entity.User;
import com.expense.expensetrack.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: shh
 * @createTime: 2025/1/1822:01
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUsers() {
        return userDao.findAll();
    }
}
