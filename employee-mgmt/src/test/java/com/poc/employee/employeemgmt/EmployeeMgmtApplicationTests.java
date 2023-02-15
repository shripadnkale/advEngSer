package com.poc.employee.employeemgmt;

import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import com.poc.employee.employeemgmt.repository.EmployeeRepository;
import com.poc.employee.employeemgmt.service.EmployeeService;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class EmployeeMgmtApplicationTests {		
	
	@Mock
	private EmployeeRepository employeeRepository;
	
	private EmployeeService employeeService;
	
	 @BeforeEach void setUp()
	    {
	        this.employeeService
	            = new EmployeeService(this.employeeRepository);
	    }
	
	@Test
	public void getAllEmployee() {
		
		employeeService.getAllEmployee();
		verify(employeeRepository).findAll();
	}

}