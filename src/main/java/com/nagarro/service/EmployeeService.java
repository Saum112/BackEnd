package com.nagarro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.model.Employee;
import com.nagarro.repository.EmployeeRepository;

/**
 * This class contains the business logic
 * 
 * @author saumyaawasthi
 *
 */

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;

	public List<Employee> getEmployees() {

		return repo.findAll();
	}

	public String uploadEmployee(Employee emp) {
		String Result = "OK";
		try {
			repo.save(emp);
		} catch (Exception ex) {
			Result = "Error";
		}
		return Result;
	}

	public String updateEmployee(Employee emp) {
		String Result = "OK";
		try {
			repo.save(emp);
		} catch (Exception ex) {
			Result = "Error";
		}
		return Result;
	}
}
