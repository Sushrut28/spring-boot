package com.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeemanager.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
