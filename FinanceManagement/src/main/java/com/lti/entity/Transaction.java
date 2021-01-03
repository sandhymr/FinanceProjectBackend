package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tbl_transaction")
public class Transaction {

	@Id
	@SequenceGenerator(name = "seq_trans",allocationSize = 1,initialValue = 600001)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_trans")
	private int transactionId;
	private int amountPaid;
	private LocalDate transactionDate;
	
	@ManyToOne
	User user;	
	@ManyToOne
    ProductPurchased productPurchased;
	@ManyToOne
	Card card;
	
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(int amountPaid) {
		this.amountPaid = amountPaid;
	}
	public LocalDate getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public ProductPurchased getProductPurchased() {
		return productPurchased;
	}
	public void setProductPurchased(ProductPurchased productPurchased) {
		this.productPurchased = productPurchased;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	
	
	
}
