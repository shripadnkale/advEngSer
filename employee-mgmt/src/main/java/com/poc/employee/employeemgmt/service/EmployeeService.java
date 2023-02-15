package com.poc.employee.employeemgmt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.employee.employeemgmt.model.Employee;
import com.poc.employee.employeemgmt.repository.EmployeeRepository;

/**
 * Service Implementation class for the employee
 * @author Advanced Engineering Services
 *
 */
@Service
public class EmployeeService {
	
	/**
	 * reference object for employee repository
	 */
	@Autowired
	EmployeeRepository employeeRepository;
	
	public EmployeeService(EmployeeRepository employeeRepository2) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Fetches list of all the employees using the employee repository
	 * @return empList
	 */
	public List<Employee> getAllEmployee() {
		List<Employee> empList = new ArrayList<Employee>();
		employeeRepository.findAll().forEach(emp->empList.add(emp));		
		return empList;
	}
	
	/**
	 * Fetch the employee object for the given id
	 * @param id
	 * @return employee
	 */
	public Employee getEmployeeById(int id) {
		
		return employeeRepository.findById(id).get();
	}
	
	/**
	 * Save the employee object received
	 * @param employee
	 */
	public void saveOrUpdate(Employee employee) {
		
		employeeRepository.save(employee);
	}
	
	/**
	 * Delete the employee record based on the id received
	 * @param id
	 */
	public void deleteEmp(int id) {
		
		employeeRepository.deleteById(id);
	}
}
