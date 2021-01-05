package com.lti.repository;

import java.time.LocalDate;
import java.util.List;

import com.lti.entity.Admin;
import com.lti.entity.Card;
import com.lti.entity.FrequentlyAskedQuestion;
import com.lti.entity.Product;
import com.lti.entity.ProductPurchased;
import com.lti.entity.Transaction;
import com.lti.entity.User;

public interface UserAndAdminRepository {

	// user
	long register(User user);

	User payJoiningFee(long userId);

	boolean login(String userName, String password);

	List<Product> viewAllProducts();

	ProductPurchased buyProduct(long userId, long productId, int emiScheme);

	Transaction payEmi(long productPurchasedId, long userId, long cardId);

	List<Transaction> viewTransactionsOfAnUser(long userId);

	List<Transaction> viewTransactionsOfAnUserByDate(long userId, LocalDate date);

//    forgotPassword(String email)
	User changePassword(long userId);

	List<FrequentlyAskedQuestion> viewFrequentlyAskedQuestions(long productId);

	// admin
	String adminRegister(Admin admin);

	boolean adminLogin(String userName, String password);

	List<User> viewAllUsers();

	List<User> viewUsersByPaid(long userId, double registrationFee);

	List<User> viewUsersByNotPaid();

	Card verifyAndGenerateCardForAnUser(long userId, Card card);

	long addAProduct(Product product);

//    6.viewAllProducts() - same as user
	List<Product> viewAllProductsPurchasedByAnUser(long userId);

//    8.viewTransactionsOfAnUser(int userId) - same as user
	long AddFrequentlyAskedQuestions(FrequentlyAskedQuestion faq);

	List<Product> viewProductsByFilter(String productType);

	
	//Extra
	Product findProductById(long productId);
}
