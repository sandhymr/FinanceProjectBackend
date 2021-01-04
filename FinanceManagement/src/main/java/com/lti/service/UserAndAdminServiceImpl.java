package com.lti.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Admin;
import com.lti.entity.Card;
import com.lti.entity.FrequentlyAskedQuestion;
import com.lti.entity.Product;
import com.lti.entity.ProductPurchased;
import com.lti.entity.Transaction;
import com.lti.entity.User;
import com.lti.repository.UserAndAdminRepository;

@Service
public class UserAndAdminServiceImpl implements UserAndAdminService {
	
	@Autowired
	UserAndAdminRepository userAndAdminRepository;

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
        List<Product> products = userAndAdminRepository.viewAllProducts();
        if(products.isEmpty()) {
        	return null;
        }else {
           return products;	
        }
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
	public List<Transaction> viewTransactionsOfAnUserByDate(int userId, String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
	    List<Transaction> transactions = userAndAdminRepository.viewTransactionsOfAnUserByDate(userId, localDate);
	    if(transactions != null) {
	    	return transactions;
	    }else {
	    	return null;
	    }
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
		String result = userAndAdminRepository.adminRegister(admin);
		if(result!=null) {
			return "Registered successfully";
		}else {
			return "Registration failed.";
		}
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
	public List<User> viewUsersByNotPaid() {
		List<User> users = userAndAdminRepository.viewUsersByNotPaid();
		if(users.isEmpty()) {
			return null;
		}else {
		    return users;	
		}
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
	public String AddFrequentlyAskedQuestions(int productId, FrequentlyAskedQuestion faq) {
		long result = userAndAdminRepository.AddFrequentlyAskedQuestions(productId, faq);
		if(result < 0) {
			return "Failed to add the details";
		}else {
			return "Added successfully";
		}
	    
	}

	@Override
	public List<Product> viewProductsByFilter(String productType) {
		// TODO Auto-generated method stub
		return null;
	}

}
