package com.expense.expensetrack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com/expense/expensetrack/entity")
public class ExpensetrackApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpensetrackApplication.class, args);
	}

}
