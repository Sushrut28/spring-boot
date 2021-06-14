package com.employeemanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanager.model.Employee;
import com.employeemanager.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	public EmployeeService m_service;

	@GetMapping
	public List<Employee> getAllEmployedd() {
		return m_service.getAllEmployees();
	}

	@PostMapping
	public Employee addEmployee() {

		return new Employee();
	}
}
