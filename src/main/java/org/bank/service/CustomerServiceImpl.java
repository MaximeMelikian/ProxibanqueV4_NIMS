package org.bank.service;

import java.util.List;

import org.bank.entity.Customer;
import org.bank.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	ICustomerRepository iCustomerRepo;

	@Override
	public void createCustomer(Customer customer) {
		if (customer != null) {
			iCustomerRepo.save(customer);

		}

	}

	@Override
	public Customer getCustomerById(Long id) {

		return iCustomerRepo.findById(id).get();

	}

	@Override
	public List<Customer> getListCustomer() {

		return iCustomerRepo.findAll();
	}

	@Override
	public void updateCustomer(Customer updatedCustomer) {
		Customer c1 = iCustomerRepo.findById(updatedCustomer.getId()).get();
		c1.setFirstname(updatedCustomer.getFirstname());
		c1.setLastname(updatedCustomer.getLastname());
		c1.setAddress(updatedCustomer.getAddress());
		c1.setPostalCode(updatedCustomer.getPostalCode());
		c1.setCity(updatedCustomer.getCity());
		c1.setTelephone(updatedCustomer.getTelephone());
		c1.setEmail(updatedCustomer.getEmail());
		iCustomerRepo.save(c1);

	}

	@Override
	public void deleteCustomer(Long id) {
		iCustomerRepo.deleteById(id);

	}
}