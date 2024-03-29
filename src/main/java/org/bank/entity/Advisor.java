package org.bank.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Advisor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idAdvisor;
	private String fisrtName;
	private String lastName;
	private String login;
	private String password;

	@JsonIgnore
	@OneToMany(mappedBy = "advisor", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	private Set<Customer> setCustomer = new HashSet<Customer>();

//	constructeur
	public Advisor() {
	}

	public Advisor(String fisrtName, String lastName, String login, String password) {
		this.fisrtName = fisrtName;
		this.lastName = lastName;
		this.login = login;
		this.password = password;
	}

	public Advisor(Long idAdvisor, String fisrtName, String lastName, String login, String password,
			Set<Customer> setCustomer) {
		this.idAdvisor = idAdvisor;
		this.fisrtName = fisrtName;
		this.lastName = lastName;
		this.login = login;
		this.password = password;
		this.setCustomer = setCustomer;
	}


	

	// getters et setters
	public Long getIdAdvisor() {
		return idAdvisor;
	}

	

	public void setIdAdvisor(Long idAdvisor) {
		this.idAdvisor = idAdvisor;
	}

	public String getFisrtName() {
		return fisrtName;
	}

	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Customer> getSetCustomer() {
		return setCustomer;
	}

	public void setSetCustomer(Set<Customer> setCustomer) {
		this.setCustomer = setCustomer;
	}

	@Override
	public String toString() {
		return "Advisor [idAdvisor=" + idAdvisor + ", fisrtName=" + fisrtName + ", lastName=" + lastName + ", login="
				+ login + ", password=" + password + ", setCustomer=" + setCustomer + "]";
	}

}
