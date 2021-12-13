/**
 * 
 */
package com.finicity.hr.emp.service.mongo;

import java.util.List;

import com.finicity.hr.emp.model.mongo.Employee;

/**
 * @author iningthoujam
 *
 */
public interface EmployeeMongoService {
	
	List<Employee> getAllEmployees();
	
	void addUpdateEmployee(Employee employee);

}
