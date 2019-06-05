package org.bank.entity;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SavingsAcc")
public class SavingsAccount extends Account implements Serializable{

	private static final double INTERESTRATE = 1.03;

	// Constructeur

	public SavingsAccount() {
	}

	// Getters and setters

	public static double getInterestrate() {
		return INTERESTRATE;
	}

}
