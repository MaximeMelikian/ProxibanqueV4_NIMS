package org.bank.restcontroller;

import java.util.List;

import org.bank.entity.Advisor;
import org.bank.service.IAdvisorService;
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
@RequestMapping("/advisors")
@CrossOrigin(origins = "http://localhost:4200")
public class RestAdvisorController {

	// Test url : http://localhost:4200/advisors/(id)
	
	@Autowired
	IAdvisorService iAdvisorServ;
	
	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping
	public Advisor createAdvisor(@RequestBody Advisor advisor) {
		iAdvisorServ.createAdvisor(advisor);
		return advisor;
	}

	@GetMapping("/{id}")
	public Advisor getAdvisor(@PathVariable("id") Long id) {

		return iAdvisorServ.getAdvisorById(id);
	}

	@GetMapping
	public List<Advisor> getAllAdvisors() {
		return iAdvisorServ.getListAdvisor();
	}

	@PutMapping
	public Advisor updateAdvisor(@RequestBody Advisor updatedAdvisor) {
		iAdvisorServ.updateAdvisor(updatedAdvisor);
		return iAdvisorServ.getAdvisorById(updatedAdvisor.getIdAdvisor());

	}

	@DeleteMapping("/{id}")
	public void deleteAdvisor(@PathVariable("id") Long id) {

		iAdvisorServ.deleteAdvisor(id);
	}
	
}
