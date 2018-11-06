package org.amir.minibank.servicesImpl;

import org.amir.minibank.dao.EmployeeManager;
import org.amir.minibank.dbmodels.Employee;
import org.amir.minibank.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	@Autowired
	EmployeeManager empManager;
	@Override
	public Employee create(Employee emp) {
		// TODO Auto-generated method stub
		empManager.save(emp);
		return emp;
	}

	
}
