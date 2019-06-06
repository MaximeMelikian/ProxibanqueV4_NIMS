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
	public void createCustomer() {
		//Customer client = new Customer("Didier","Deschamps");
	
		Customer client4 = new Customer("Paul", "Pogba");
		Customer client5 = new Customer("Catherine", "Deneuve");
		Customer client6 = new Customer("Chloé", "Spinnato");
		Customer client7 = new Customer("Monica", "Bellucci");
		Customer client8 = new Customer("Emanuelle", "Béart");
		Customer client9 = new Customer("Isabelle", "Adjani");
		//iCustomerRepo.save(client);
	
		iCustomerRepo.save(client4);
		iCustomerRepo.save(client5);
		iCustomerRepo.save(client6);
		iCustomerRepo.save(client7);
		iCustomerRepo.save(client8);
		iCustomerRepo.save(client9);
		
	}
	
}
