package com.poc.employee.employeemgmt.repository;

import org.springframework.data.repository.CrudRepository;

import com.poc.employee.employeemgmt.model.Employee;


/**
 * Repository interface for Employee
 * @author Advanced Engineering Services
 * 
 */
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
