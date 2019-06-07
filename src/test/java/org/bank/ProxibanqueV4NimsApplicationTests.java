package org.bank;

import java.util.ArrayList;
import java.util.List;

import org.bank.entity.Account;
import org.bank.entity.Advisor;
import org.bank.entity.CreditCard;
import org.bank.entity.CurrentAccount;
import org.bank.entity.Customer;
import org.bank.entity.Enterprise;
import org.bank.entity.Particular;
import org.bank.entity.SavingsAccount;
import org.bank.repository.IAccountRepository;
import org.bank.repository.IAdvisorRepository;
import org.bank.repository.ICardRepository;
import org.bank.repository.ICustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProxibanqueV4NimsApplicationTests {

	@Autowired
	ICustomerRepository iCustomerRepo;

	@Autowired
	IAdvisorRepository iAdvisorRepo;

	@Autowired
	IAccountRepository iAccountRepo;

	@Autowired
	ICardRepository iCardRepo;

	@Test
	void contextLoads() {
	}

	@Test
	public void createAdvisor() {
		Advisor advisor1 = new Advisor("Imane", "Elghouafi", "admin@proxibanque.com", "pastis51");
		Advisor advisor2 = new Advisor("Samirath", "Gibigaye", "admin@proxibanque.com", "pastis51");
		Advisor advisor3 = new Advisor("Nawal", "Alozade", "admin@proxibanque.com", "pastis51");
		Advisor advisor4 = new Advisor("Maxime", "Melikian", "admin@proxibanque.com", "pastis51");
		Advisor advisor5 = new Advisor("Yann", "CREAC'H", "yann.creach@gmail.com", "pastis51");

		iAdvisorRepo.save(advisor1);
		iAdvisorRepo.save(advisor2);
		iAdvisorRepo.save(advisor3);
		iAdvisorRepo.save(advisor4);
		iAdvisorRepo.save(advisor5);
	}

	@Test
	public void createCustomer() {
		// Customer client = new Customer("Didier","Deschamps");

//		Customer client0 = new Particular("firstname", "lastname", "address", "postalCode", "city", "telephone", "email");

		Customer client1 = new Particular("Paul", "Pogba", "Stade de France", "93000", "St Denis", "0102030405",
				"paul.pogba@laposte.net");
		Customer client2 = new Particular("Catherine", "Deneuve", "La Croisette", "06400", "Cannes", "0102030406",
				"catherine.deneuve@laposte.net");
		Customer client3 = new Particular("Monica", "Bellucci", "Fontana di Trevi", "00100", "Rome", "0102030407",
				"monica.bellucci@laposte.net");
		Customer client4 = new Particular("Emanuelle", "Béart", "Plage des coquillages", "83100", "St Tropez",
				"0102030408", "emanuelle.beart@laposte.net");
		Customer client5 = new Particular("Isabelle", "Adjani", "Place Garibaldi", "06000", "Nice", "0102030409",
				"isabelle.adjani@laposte.net");
//		Customer client6 = new Particular("Didier", "Deschamps","Stade de France","93000","St Denis","0102030410","didier.deschamps@laposte.net");
//		Customer client7 = new Particular("Sophie", "Marceau","Stade de France","93000","St Denis","0102030411","sophie.marceau@laposte.net");
//		Customer client8 = new Particular("Marcel", "Desailly","Stade de France","93000","St Denis","0102030412","marcel.desailly@laposte.net");
//		Customer client9 = new Particular("Laurent", "Blanc","Stade de France","93000","St Denis","0102030413","laurent.blanc@laposte.net");
//		Customer client10 = new Particular("Chloé", "Spinnato","Stade de France","93000","St Denis","0102030414","chloe.spinnato@laposte.net");
//		Customer client11 = new Particular("Jérémi", "Pirat","Stade de France","93000","St Denis","0102030408","jeremi.pirat@laposte.net");
//		Customer client12 = new Particular("Jean-Charles", "Alexandre","Stade de France","93000","St Denis","0102030408","jean-charles.alexandre@laposte.net");
//		Customer client13 = new Particular("Gwennhäelle", "Pype","Stade de France","93000","St Denis","0102030408","gwennhaelle.pype@laposte.net");
//		Customer client14 = new Particular("Marwa", "Tifafi","Stade de France","93000","St Denis","0102030408","marwa.tifafi@laposte.net");
//		Customer client15 = new Particular("Jean", "Dujardin");
//		Customer client16 = new Particular("Penelope", "Cruz");
//		Customer client17 = new Particular("Adeline", "Chang");
//		Customer client18 = new Particular("Joachim", "Rogeon");
//		Customer client19 = new Particular("Stéphane", "N'Guyen");
//		Customer client20 = new Particular("Jean-Pierre", "Papin");
//		Customer client25 = new Particular("Jean-Pierre", "Papin");
//		Customer client21 = new Enterprise("SA", "Danone");
//		Customer client22 = new Enterprise("SA", "Peugeot");
		Customer client23 = new Enterprise("SA", "Sodebo", "Rue de la République", "13000", "Marseille", "0123456789",
				"client@sodebo.com");
		Customer client24 = new Enterprise("SA", "Findus", "Rue du Vieux Port", "83000", "Toulon", "0234596477",
				"client@findus.com");

//		iCustomerRepo.save(client1);
//		iCustomerRepo.save(client2);
//		iCustomerRepo.save(client3);
//		iCustomerRepo.save(client4);
//		iCustomerRepo.save(client5);
//		iCustomerRepo.save(client6);
//		iCustomerRepo.save(client7);
//		iCustomerRepo.save(client8);
//		iCustomerRepo.save(client9);
//		iCustomerRepo.save(client10);
//		iCustomerRepo.save(client11);
//		iCustomerRepo.save(client12);
//		iCustomerRepo.save(client13);
//		iCustomerRepo.save(client14);
//		iCustomerRepo.save(client15);
//		iCustomerRepo.save(client16);
//		iCustomerRepo.save(client17);
//		iCustomerRepo.save(client18);
//		iCustomerRepo.save(client19);
//		iCustomerRepo.save(client20);
//		
		iCustomerRepo.save(client1);
		iCustomerRepo.save(client2);
		iCustomerRepo.save(client3);
		iCustomerRepo.save(client4);
		iCustomerRepo.save(client5);
		iCustomerRepo.save(client23);
		iCustomerRepo.save(client24);
	}

	@Test
	public void createAccount() {
//		Account compte0 = new CurrentAccount("accountNumber", "balance", "creationDate");
		Account compte1 = new CurrentAccount("PROXI00001", 100000, "01/04/2019");
		Account compte2 = new SavingsAccount("PROXI00002", 1000000, "02/04/2019");
		Account compte3 = new CurrentAccount("PROXI00003", 200000, "03/04/2019");
		Account compte4 = new SavingsAccount("PROXI00004", 2000000, "04/04/2019");
		Account compte5 = new CurrentAccount("PROXI00005", 300000, "05/04/2019");
		Account compte6 = new SavingsAccount("PROXI00006", 3000000, "06/04/2019");
		Account compte7 = new SavingsAccount("PROXI00007", 400000, "07/04/2019");
		Account compte8 = new SavingsAccount("PROXI00008", 4000000, "08/04/2019");
		Account compte9 = new SavingsAccount("PROXI00009", 500000, "09/04/2019");
		Account compte10 = new SavingsAccount("PROXI00010", 5000000, "10/04/2019");
		Account compte11 = new SavingsAccount("PROXI00011", 600000, "11/04/2019");
		Account compte12 = new SavingsAccount("PROXI00012", 6000000, "12/04/2019");
		Account compte13 = new SavingsAccount("PROXI00013", 700000, "13/04/2019");
		Account compte14 = new SavingsAccount("PROXI00014", 7000000, "14/04/2019");

		iAccountRepo.save(compte1);
		iAccountRepo.save(compte2);
		iAccountRepo.save(compte3);
		iAccountRepo.save(compte4);
		iAccountRepo.save(compte5);
		iAccountRepo.save(compte6);
		iAccountRepo.save(compte7);
		iAccountRepo.save(compte8);
		iAccountRepo.save(compte9);
		iAccountRepo.save(compte10);
		iAccountRepo.save(compte11);
		iAccountRepo.save(compte12);
		iAccountRepo.save(compte13);
		iAccountRepo.save(compte14);

	}

	@Test
	public void createCreditCard() {
		CreditCard creditCard1 = new CreditCard("Visa Premier");
		CreditCard creditCard2 = new CreditCard("Visa Electron");
		CreditCard creditCard3 = new CreditCard("Visa Premier");
		CreditCard creditCard4 = new CreditCard("Visa Electron");
		CreditCard creditCard5 = new CreditCard("Visa Premier");
		CreditCard creditCard6 = new CreditCard("Visa Electron");
		CreditCard creditCard7 = new CreditCard("Visa Premier");

		iCardRepo.save(creditCard1);
		iCardRepo.save(creditCard2);
		iCardRepo.save(creditCard3);
		iCardRepo.save(creditCard4);
		iCardRepo.save(creditCard5);
		iCardRepo.save(creditCard6);
		iCardRepo.save(creditCard7);
	}

//	Méthodes d'association

	public void associateCardAccount(Long idCard, Long idAccount) {
		CreditCard card1 = iCardRepo.findById(idCard).get();
		Account compte1 = iAccountRepo.findById(idAccount).get();
		compte1.setCreditCard(card1);
		iAccountRepo.save(compte1);

	}

	@Test // Execution
	public void associateSeveralCardAccount() {
		associateCardAccount(27L, 13L);
		associateCardAccount(28L, 15L);
		associateCardAccount(29L, 17L);
		associateCardAccount(30L, 19L);
		associateCardAccount(31L, 21L);
		associateCardAccount(32L, 23L);
		associateCardAccount(33L, 25L);
		
	}
	
	public void associateAccountCustomer(Long idAccount, Long idCustomer) {
		Account compte1 = iAccountRepo.findById(idAccount).get();
		Customer customer1 = iCustomerRepo.findById(idCustomer).get();

		compte1.setCustomer(customer1);
		iAccountRepo.save(compte1);

		List<Account> listAccounts = new ArrayList<Account>();
		listAccounts.add(compte1);

		iCustomerRepo.save(customer1);
	}

	@Test // Execution
	public void associateSeveralAccountsCustomers() {
		associateAccountCustomer(13L, 6L);
		associateAccountCustomer(14L, 6L);
		associateAccountCustomer(15L, 7L);
		associateAccountCustomer(16L, 7L);
		associateAccountCustomer(17L, 8L);
		associateAccountCustomer(18L, 8L);
		associateAccountCustomer(19L, 9L);
		associateAccountCustomer(20L, 9L);
		associateAccountCustomer(21L, 10L);
		associateAccountCustomer(22L, 10L);
		associateAccountCustomer(23L, 11L);
		associateAccountCustomer(24L, 11L);
		associateAccountCustomer(25L, 12L);
		associateAccountCustomer(26L, 12L);

	}

	// Méthode d'association
	public void associateCustomerAdvisor(Long idCustomer, Long idAvisor) {
		Customer customer1 = iCustomerRepo.findById(idCustomer).get();
		Advisor advisor1 = iAdvisorRepo.findById(idAvisor).get();

		customer1.setAdvisor(advisor1);
		iCustomerRepo.save(customer1);

		List<Customer> listCustomers = new ArrayList<Customer>();
		listCustomers.add(customer1);
		iAdvisorRepo.save(advisor1);
	}

	@Test
	public void associateSeveralCustomerAdvisor() {
		associateCustomerAdvisor(6L, 1L);
		associateCustomerAdvisor(7L, 2L);
		associateCustomerAdvisor(8L, 3L);
		associateCustomerAdvisor(9L, 4L);
		associateCustomerAdvisor(10L, 5L);
		associateCustomerAdvisor(11L, 1L);
		associateCustomerAdvisor(12L, 2L);

	}

}
