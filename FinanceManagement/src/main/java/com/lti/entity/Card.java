package com.lti.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_card")
public class Card {
	
	@Id
	@SequenceGenerator(name = "seq_card",initialValue = 300001,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_user")
	private long cardId;
	private LocalDate validity;
	private boolean status;
	private double totalCredit;
	private double creditUsed;
	private double creditRemaining;
	
	@OneToOne
	@JoinColumn(name = "userId")
	User user;

	@OneToMany(mappedBy = "card",cascade = CascadeType.ALL)
	List<Transaction> transactions;

	public long getCardId() {
		return cardId;
	}

	public void setCardId(long cardId) {
		this.cardId = cardId;
	}

	public LocalDate getValidity() {
		return validity;
	}

	public void setValidity(LocalDate validity) {
		this.validity = validity;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double getTotalCredit() {
		return totalCredit;
	}

	public void setTotalCredit(double totalCredit) {
		this.totalCredit = totalCredit;
	}

	public double getCreditUsed() {
		return creditUsed;
	}

	public void setCreditUsed(double creditUsed) {
		this.creditUsed = creditUsed;
	}

	public double getCreditRemaining() {
		return creditRemaining;
	}

	public void setCreditRemaining(double creditRemaining) {
		this.creditRemaining = creditRemaining;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	
}
