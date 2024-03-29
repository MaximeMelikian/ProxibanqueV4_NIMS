package org.bank.entity;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Account_Type", discriminatorType = DiscriminatorType.STRING)
public class Account {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idAccount;
	private String accountNumber;
	private double balance;
	private String creationDate;

	//@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@ManyToOne(cascade = { CascadeType.PERSIST})
	@JoinColumn(name = "client_id")
	private Customer customer;
	@OneToOne
	@JoinColumn(name = "creditcard_id", unique = true)
	private CreditCard creditCard;

	// Constructeur

	public Account() {
	}

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public Account(String accountNumber, double balance, String creationDate) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.creationDate = creationDate;
	}

	public Account(Long idAccount, String accountNumber, double balance, String creationDate, Customer customer) {
		this.idAccount = idAccount;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.creationDate = creationDate;
		// this.customer = customer;
	}

	// Getters and Setters
	public Long getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(Long idAccount) {
		this.idAccount = idAccount;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}
	
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	// toString


	@Override
	public String toString() {
		return "Account [idAccount=" + idAccount + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ ", creationDate=" + creationDate + ", customer=" + customer + "]";
	}

}
