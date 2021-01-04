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

	User payJoiningFee(int userId);

	boolean login(String userName, String password);

	List<Product> viewAllProducts();

	ProductPurchased buyProduct(int userId, int productId, String emiScheme);

	Transaction payEmi(int productPurchasedId, int userId, int cardId);

	List<Transaction> viewTransactionsOfAnUser(int userId);

	List<Transaction> viewTransactionsOfAnUserByDate(int userId, LocalDate date);

//    forgotPassword(String email)
	User changePassword(int userId);

	List<FrequentlyAskedQuestion> viewFrequentlyAskedQuestions(int productId);

	// admin
	String adminRegister(Admin admin);

	boolean adminLogin(String userName, String password);

	List<User> viewAllUsers();

	List<User> viewUsersByPaid(int userId, double registrationFee);

	List<User> viewUsersByNotPaid();

	Card verifyAndGenerateCardForAnUser(int userId, Card card);

	long addAProduct(Product product);

//    6.viewAllProducts() - same as user
	List<Product> viewAllProductsPurchasedByAnUser(int userId);

//    8.viewTransactionsOfAnUser(int userId) - same as user
	long AddFrequentlyAskedQuestions(int productId, FrequentlyAskedQuestion faq);

	List<Product> viewProductsByFilter(String productType);

}
