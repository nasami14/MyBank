package org.amir.minibank.controllerImpl;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.amir.minibank.controller.EmployeeController;
import org.amir.minibank.dbmodels.Employee;
import org.amir.minibank.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value="/minibank")
public class EmployeeControllerImpl implements EmployeeController
{

	@Autowired
	private EmployeeService empService;
	
	@ResponseBody
	@RequestMapping(value="/employee/register", method= {POST})
	@Override
	public ResponseEntity<Employee> register(@RequestBody Employee emp) {
		// TODO Auto-generated method stub
		empService.create(emp);
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	}

	

}
