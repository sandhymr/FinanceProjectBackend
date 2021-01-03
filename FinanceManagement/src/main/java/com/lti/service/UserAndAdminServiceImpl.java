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

public class UserAndAdminServiceImpl implements UserAndAdminService {

	@Override
	public long register(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User payJoiningFee(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean login(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Product> viewAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductPurchased buyProduct(int userId, int productId, String emiScheme) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transaction payEmi(int productPurchasedId, int userId, int cardId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transaction> viewTransactionsOfAnUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transaction> viewTransactionsOfAnUserByDate(int userId, LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String forgotPassword(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User changePassword(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FrequentlyAskedQuestion> viewFrequentlyAskedQuestions(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String adminRegister(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean adminLogin(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> viewAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> viewUsersByPaid(int userId, double registrationFee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> viewUsersByNotPaid(int userId, double registrationFee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Card verifyAndGenerateCardForAnUser(int userId, Card card) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long addAProduct(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Product> viewAllProductsPurchasedByAnUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long AddFrequentlyAskedQuestions(int productId, FrequentlyAskedQuestion faq) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Product> viewProductsByFilter(String productType) {
		// TODO Auto-generated method stub
		return null;
	}

}
