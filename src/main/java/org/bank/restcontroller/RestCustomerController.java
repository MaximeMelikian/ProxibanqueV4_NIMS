package org.bank.restcontroller;

import java.util.List;

import org.bank.entity.Customer;
import org.bank.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
@CrossOrigin(origins = "http://localhost:4200")
public class RestCustomerController {

	@Autowired
	ICustomerService iCustomerserv;

	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping
	public Customer createCustomer(@RequestBody Customer customer) {
		iCustomerserv.createCustomer(customer);
		return customer;
	}

	@GetMapping("/{id}")
	public Customer getCustomer(@PathVariable("id") Long id) {

		return iCustomerserv.getCustomerById(id);
	}

	@GetMapping
	public List<Customer> getAllCustomers() {
		return iCustomerserv.getListCustomer();
	}

	@PutMapping
	public Customer updateCustomer(@RequestBody Customer updatedCustomer) {
		iCustomerserv.updateCustomer(updatedCustomer);
		return iCustomerserv.getCustomerById(updatedCustomer.getId());

	}

	@DeleteMapping("/{id}")
	public void deleteCustomer(@PathVariable("id") Long id) {

		iCustomerserv.deleteCustomer(id);
	}
}