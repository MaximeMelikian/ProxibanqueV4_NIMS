package org.bank;

import org.bank.repository.IAccountRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestMethodDelete {

	@Autowired
	IAccountRepository iAccountRepo;
	
	@Test
	public void deleteAccount() {
		iAccountRepo.deleteById(22L);
	}
	
}
