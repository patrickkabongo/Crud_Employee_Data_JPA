package com.springboot.employee.crudemployee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.employee.crudemployee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	// That's it ... no need to write any code LOL!
}
