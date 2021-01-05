package com.lti.repository;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.entity.Admin;
import com.lti.entity.Card;
import com.lti.entity.FrequentlyAskedQuestion;
import com.lti.entity.Product;
import com.lti.entity.ProductPurchased;
import com.lti.entity.Transaction;
import com.lti.entity.User;

@Repository
public class UserAndAdminRepositoryImpl implements UserAndAdminRepository {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public long register(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User payJoiningFee(long userId) {
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
		String jpql="from Product p";
		TypedQuery<Product> query = em.createQuery(jpql, Product.class);
		return query.getResultList();
	}

	@Override
	public ProductPurchased buyProduct(long userId, long productId, int emiScheme) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transaction payEmi(long productPurchasedId, long userId, long cardId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transaction> viewTransactionsOfAnUser(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transaction> viewTransactionsOfAnUserByDate(long userId, LocalDate date) {
		String jpql="from Transaction t where t.userId=:userId and t.transactionDate=:date";
		TypedQuery<Transaction> query = em.createQuery(jpql, Transaction.class);
		query.setParameter("userId", userId);
		query.setParameter("date", date);
		return query.getResultList();
	}

	@Override
	public User changePassword(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FrequentlyAskedQuestion> viewFrequentlyAskedQuestions(long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public String adminRegister(Admin admin) {
		Admin newAdmin = em.merge(admin);
		return newAdmin.getUserName();
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
	public List<User> viewUsersByPaid(long userId, double registrationFee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> viewUsersByNotPaid() {
		String jpql="from User u where u.registrationFee<0";
		TypedQuery<User> query = em.createQuery(jpql, User.class);
		return query.getResultList();
	}

	@Override
	public Card verifyAndGenerateCardForAnUser(long userId, Card card) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long addAProduct(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Product> viewAllProductsPurchasedByAnUser(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long AddFrequentlyAskedQuestions(FrequentlyAskedQuestion faq) {
		return em.merge(faq).getFaqId();
	}

	@Override
	public List<Product> viewProductsByFilter(String productType) {
		// TODO Auto-generated method stub
		return null;
	}
	

	//Extra
	
	@Override
	public Product findProductById(long productId) {
		return em.find(Product.class, productId);
	}

}
