package com.lti.service;

import java.time.LocalDate;
import java.util.List;

import com.lti.entity.Admin;
import com.lti.entity.Card;
import com.lti.entity.FrequentlyAskedQuestion;
import com.lti.entity.Product;
import com.lti.entity.ProductPurchased;
import com.lti.entity.Transaction;
import com.lti.entity.User;

public interface UserAndAdminService {

	// user
		long register(User user);   //a

		User payJoiningFee(int userId); //b

		boolean login(String userName, String password); //d

		List<Product> viewAllProducts(); //s

		ProductPurchased buyProduct(int userId, int productId, String emiScheme); //a

		Transaction payEmi(int productPurchasedId, int userId, int cardId); //b

		List<Transaction> viewTransactionsOfAnUser(int userId); //d

		List<Transaction> viewTransactionsOfAnUserByDate(int userId, LocalDate date); //s

	    String forgotPassword(String email); //a
	    
		User changePassword(int userId); //b

		List<FrequentlyAskedQuestion> viewFrequentlyAskedQuestions(int productId); //d

		// admin
		String adminRegister(Admin admin); //s

		boolean adminLogin(String userName, String password); //a

		List<User> viewAllUsers(); //b

		List<User> viewUsersByPaid(int userId, double registrationFee); //d

		List<User> viewUsersByNotPaid(int userId, double registrationFee); //s

		Card verifyAndGenerateCardForAnUser(int userId, Card card); //a

		long addAProduct(Product product); //b

//	    6.viewAllProducts() - same as user
		List<Product> viewAllProductsPurchasedByAnUser(int userId); //d

//	    8.viewTransactionsOfAnUser(int userId) - same as user
		long AddFrequentlyAskedQuestions(int productId, FrequentlyAskedQuestion faq); //s

		List<Product> viewProductsByFilter(String productType); //a

}
