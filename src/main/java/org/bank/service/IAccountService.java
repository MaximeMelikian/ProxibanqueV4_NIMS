package org.bank.service;

import java.util.List;

import org.bank.entity.Account;

public interface IAccountService {
	
	public void createAccount(Account account);

	public Account getAccountById(Long idAccount);

	public List<Account> getListAccount();

	public void deleteAccount(Long idAccount);

	public void updateAccount(Account updatedAccount);
	

}
