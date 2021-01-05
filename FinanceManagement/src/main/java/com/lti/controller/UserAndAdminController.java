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
	
	public String AddFrequentlyAskedQuestions(FrequentlyAskedQuestion faq) {
		return userAndAdminService.AddFrequentlyAskedQuestions(faq);	    
	}

	public List<Transaction> viewTransactionsOfAnUserByDate(long userId, String date) {
		return userAndAdminService.viewTransactionsOfAnUserByDate(userId, date);
	}
	
	public Product findProductById(long productId) {
		return userAndAdminService.findProductById(productId);
		
	}
}
