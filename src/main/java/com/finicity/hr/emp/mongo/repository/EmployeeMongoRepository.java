package com.finicity.hr.emp.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.finicity.hr.emp.model.mongo.Employee;

@Repository
public interface EmployeeMongoRepository extends MongoRepository<Employee, Long>{

}
