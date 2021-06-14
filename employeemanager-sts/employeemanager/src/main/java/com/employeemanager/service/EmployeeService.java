package com.employeemanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanager.model.Employee;
import com.employeemanager.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository m_repo;

	public List<Employee> getAllEmployees() {
		return m_repo.findAll();
	}

}
