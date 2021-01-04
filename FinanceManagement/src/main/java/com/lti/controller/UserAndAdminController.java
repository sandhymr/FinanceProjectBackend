package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lti.entity.Admin;
import com.lti.entity.FrequentlyAskedQuestion;
import com.lti.entity.Product;
import com.lti.entity.Transaction;
import com.lti.entity.User;
import com.lti.service.UserAndAdminService;

@Controller
public class UserAndAdminController {

	@Autowired
	UserAndAdminService userAndAdminService;

	public List<Product> viewAllProducts() {
		return userAndAdminService.viewAllProducts();
	}

	public String adminRegister(Admin admin) {
		return userAndAdminService.adminRegister(admin);
	}
	
	public List<User> viewUsersByNotPaid() {
		return userAndAdminService.viewUsersByNotPaid();
	}
	
	public String AddFrequentlyAskedQuestions(int productId, FrequentlyAskedQuestion faq) {
		return userAndAdminService.AddFrequentlyAskedQuestions(productId, faq);	    
	}

	public List<Transaction> viewTransactionsOfAnUserByDate(int userId, String date) {
		return userAndAdminService.viewTransactionsOfAnUserByDate(userId, date);
	}
	
}
