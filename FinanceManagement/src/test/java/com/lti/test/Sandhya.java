package com.lti.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.controller.UserAndAdminController;
import com.lti.entity.Admin;
import com.lti.entity.FrequentlyAskedQuestion;
import com.lti.entity.Product;
import com.lti.entity.User;

public class Sandhya {

	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	UserAndAdminController userAndAdminController = context.getBean(UserAndAdminController.class);

	@Test
	public void viewAllProducts() {
		List<Product> products = userAndAdminController.viewAllProducts();
		if (!products.isEmpty()) {
			for (Product p : products) {
				System.out.println(
						p.getProductId() + " " + p.getProductName() + " " + p.getProductType() + " " + p.getPrice());
			}
		} else {
			System.out.println("No products found");
		}
	}

	@Test
	public void adminRegister() {
		Admin admin = new Admin();
		admin.setUserName("admin1");
		admin.setPassword("admin@123");

		System.out.println(userAndAdminController.adminRegister(admin));
	}

	@Test
	public void viewUsersByNotPaid() {
		List<User> users = userAndAdminController.viewUsersByNotPaid();
		if (users.isEmpty()) {
			System.out.println("no users found");
		} else {
			for (User u : users) {
				System.out.println(u.getUserId() + " " + u.getName() + " " + u.getEmailId());
			}
		}
	}

	@Test
	public void AddFrequentlyAskedQuestions() {
		FrequentlyAskedQuestion faq = new FrequentlyAskedQuestion();
		faq.setQuestions("How many years warranty?");
		faq.setAnswer("2 years");
		Product product = new Product();
		faq.setProduct(product);

		int productId = 0;
		System.out.println(userAndAdminController.AddFrequentlyAskedQuestions(productId, faq));

	}

}