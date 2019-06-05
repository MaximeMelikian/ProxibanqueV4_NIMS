package org.bank;

import org.bank.entity.Customer;
import org.bank.repository.ICustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProxibanqueV4NimsApplicationTests {

	@Autowired
	ICustomerRepository iCustomerRepo;
	
	@Test
	void contextLoads() {
	}

	@Test
	public void ajouterClient() {
		Customer client = new Customer("Didier","Deschamps");
		iCustomerRepo.save(client);
	}
	
}
