package org.amir.minibank.dao;

import org.amir.minibank.dbmodels.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeManager  extends CrudRepository<Employee, Integer>{

}
