package com.poc.employee.employeemgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc.employee.employeemgmt.model.Employee;
import com.poc.employee.employeemgmt.service.EmployeeService;

/**
 * Controller class for Employee
 * @author Advanced Engineering Services
 *
 */
@RestController
public class EmployeeController {
	
	/**
	 * Reference object for EmployeeService class
	 */
	@Autowired
	EmployeeService employeeService;
	
	/**
	 * implemented GET method to fetch the list of all Employees
	 * @return List<Employee>
	 */
	@GetMapping("/employee")  
	public List<Employee> getAllEmployee() {
		
		return employeeService.getAllEmployee();
	}
	
	/**
	 * Fetches employees record based on the ID provided
	 * @param id
	 * @return Employee
	 */
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable("id") int id) {
		
		return employeeService.getEmployeeById(id);		
	}
	
	/**
	 * delete the employee record for the give employee Id
	 * @param id
	 */
	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable("id") int id) {
		
		employeeService.deleteEmp(id);	
	}
	
	/**
	 * Save the employee record for the received JSON from POST method call
	 * @param employee
	 * @return id
	 */
	@PostMapping("/employee")
	public int saveEmployee(@RequestBody Employee employee) {
		
		employeeService.saveOrUpdate(employee);
		
		 return employee.getId();		
	}
}
