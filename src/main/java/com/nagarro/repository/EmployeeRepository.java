package com.nagarro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
