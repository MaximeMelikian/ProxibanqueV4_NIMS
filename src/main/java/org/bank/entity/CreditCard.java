package org.bank.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CreditCard implements Serializable{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCard;
	private String type;
	
//	@OneToOne(mappedBy = "creditCard")
//	private Account account;

	// Constructeur
	
}