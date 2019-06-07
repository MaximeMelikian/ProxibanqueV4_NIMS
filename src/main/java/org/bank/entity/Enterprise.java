package org.bank.entity;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Enterprise")
public class Enterprise extends Customer{

	public Enterprise() {
		super();
		
	}

	public Enterprise(String firstname, String lastname) {
		super(firstname, lastname);
	}
	
	public Enterprise(Long id, String firstname, String lastname, String address, String postalCode, String city,
			String telephone, String email, Advisor advisor, List<Account> accountList) {
		super(id, firstname, lastname, address, postalCode, city, telephone, email, advisor, accountList);
		
	}

	public Enterprise(String firstname, String lastname, String address, String postalCode, String city,
			String telephone, String email) {
		super(firstname, lastname, address, postalCode, city, telephone, email);
		
	}

	@Override
	public String toString() {
		return "Enterprise [getId()=" + getId() + ", getFirstname()=" + getFirstname() + ", getLastname()="
				+ getLastname() + ", getAddress()=" + getAddress() + ", getPostalCode()=" + getPostalCode()
				+ ", getCity()=" + getCity() + ", getTelephone()=" + getTelephone() + ", getEmail()=" + getEmail()
				+ ", getAdvisor()=" + getAdvisor() + ", getAccountList()=" + getAccountList() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
}
