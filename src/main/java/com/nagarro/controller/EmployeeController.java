package com.nagarro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.model.Employee;
import com.nagarro.service.EmployeeService;

/**
 * Controller class for Employee
 * 
 * @author saumyaawasthi
 *
 */
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empservice;

	@GetMapping()
	public List<Employee> getEmployee() {
		return empservice.getEmployees();
	}

	@PostMapping()
	public String uploadEmployee(@RequestBody Employee emp) {
		String Result = "Error";
		if (emp != null)
			Result = empservice.uploadEmployee(emp);

		return Result;
	}

	@PutMapping()
	public String updateEmployee(@RequestBody Employee emp) {
		String Result = "Error";
		if (emp != null)
			Result = empservice.updateEmployee(emp);
		return Result;
	}
}
