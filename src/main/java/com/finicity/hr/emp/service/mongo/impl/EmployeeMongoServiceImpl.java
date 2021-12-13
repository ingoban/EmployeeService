/**
 * 
 */
package com.finicity.hr.emp.service.mongo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finicity.hr.emp.model.mongo.Employee;
import com.finicity.hr.emp.mongo.repository.EmployeeMongoRepository;
import com.finicity.hr.emp.service.mongo.EmployeeMongoService;

/**
 * @author iningthoujam
 *
 */
@Service
public class EmployeeMongoServiceImpl implements EmployeeMongoService {
	
	@Autowired
	private EmployeeMongoRepository employeeMongoRepository;
	
	@Override
	public List<Employee> getAllEmployees(){
		return employeeMongoRepository.findAll();
	}
	
	@Override
	public void addUpdateEmployee(Employee employee) {
		
		System.out.println("Data creation started...");
		employeeMongoRepository.save(new Employee("5","Test5","LastName1","test1","test1@gmail.com","1234567","test address1"));
		employeeMongoRepository.save(new Employee("6","Test6","LastName2","test2","test2@gmail.com","12345678","test address1"));
		employeeMongoRepository.save(new Employee("7","Test7","LastName3","test3","test3@gmail.com","123456789","test address1"));
		employeeMongoRepository.save(new Employee("8","Test8","LastName4","test4","test4@gmail.com","1234567890","test address1"));
        System.out.println("Data creation complete...");
		
	}

}
