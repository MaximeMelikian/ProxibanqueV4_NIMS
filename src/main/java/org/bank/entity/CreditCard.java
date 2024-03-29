package org.bank.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CreditCard{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCard;
	private String type;
	
	@OneToOne(mappedBy = "creditCard")
	private Account account;

	public Long getIdCard() {
		return idCard;
	}

	public void setIdCard(Long idCard) {
		this.idCard = idCard;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "CreditCard [type=" + type + "]";
	}


	// Constructeur
	
	
	public CreditCard() {
		super();
	}
	
	
	public CreditCard(String type) {
		super();
		this.type = type;
	}

}