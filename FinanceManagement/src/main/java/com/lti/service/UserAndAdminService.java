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

		User payJoiningFee(long userId); //b

		boolean login(String userName, String password); //d

		List<Product> viewAllProducts(); //s

		ProductPurchased buyProduct(long userId, long productId, int emiScheme); //a

		Transaction payEmi(long productPurchasedId, long userId, long cardId); //b

		List<Transaction> viewTransactionsOfAnUser(long userId); //d

		List<Transaction> viewTransactionsOfAnUserByDate(long userId, String date); //s

	    String forgotPassword(String email); //a
	    
		User changePassword(long userId); //b

		List<FrequentlyAskedQuestion> viewFrequentlyAskedQuestions(long productId); //d

		// admin
		String adminRegister(Admin admin); //s

		boolean adminLogin(String userName, String password); //a

		List<User> viewAllUsers(); //b

		List<User> viewUsersByPaid(long userId, double registrationFee); //d

		List<User> viewUsersByNotPaid(); //s

		Card verifyAndGenerateCardForAnUser(long userId, Card card); //a

		long addAProduct(Product product); //b

//	    6.viewAllProducts() - same as user
		List<Product> viewAllProductsPurchasedByAnUser(long userId); //d

//	    8.viewTransactionsOfAnUser(int userId) - same as user
		String AddFrequentlyAskedQuestions(FrequentlyAskedQuestion faq); //s

		List<Product> viewProductsByFilter(String productType); //a
		
		//extra
		Product findProductById(long productId);

}
