package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Employee;
import com.app.repository.EmployeeRepo;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo eRepo;
	
	public void addEmployee(Employee emp) {
		eRepo.save(emp);
	}
	
	public List<Employee> getAllEmployee(){
		return eRepo.findAll();
	}

	public Employee getEmployeeById(int id) {
		Optional<Employee> opt =eRepo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}
	
	public void removeByEmployeeId(int id) {
		eRepo.deleteById(id);
	}

}
