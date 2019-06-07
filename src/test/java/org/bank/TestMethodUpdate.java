package org.bank;

import org.bank.entity.Account;
import org.bank.repository.IAccountRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestMethodUpdate {

	@Autowired
	IAccountRepository iAccountRepo;
	
	
	// Modifier le solde d'un compte
	
	@Test
	public void updateAccountChangeBalance() {
		Account account = iAccountRepo.findById(16L).get();
		account.setBalance(1500000);
		iAccountRepo.save(account);
	}
	
	
}
