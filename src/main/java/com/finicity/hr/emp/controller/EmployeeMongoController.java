/**
 * 
 */
package com.finicity.hr.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finicity.hr.emp.model.mongo.Employee;
import com.finicity.hr.emp.service.mongo.EmployeeMongoService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author iningthoujam
 *
 */
@RestController
@RequestMapping("/nosql/test")
@Slf4j
public class EmployeeMongoController {
	
	@Autowired
	private EmployeeMongoService employeeMongoService;
	
	@GetMapping(path="/", produces = "application/json")
    public ResponseEntity<Object> getAllEmployees(){
        List<Employee> employeeList = employeeMongoService.getAllEmployees();
        log.info("In getAllEmployees");
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }
	
	@PostMapping(path="/")
    public void addEmployee(){
        employeeMongoService.addUpdateEmployee(null);
    }

}
