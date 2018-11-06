package org.amir.minibank.controller;

import org.amir.minibank.dbmodels.Employee;
import org.springframework.http.ResponseEntity;

public interface EmployeeController {
	
	ResponseEntity<Employee> register(Employee emp);
}
