/**
 * 
 */
package com.finicity.hr.emp.model.mongo;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author iningthoujam
 *
 */
@Document("employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	@Id
	private String id;

    private String firstName;

    private String lastName;

    private String shortId;

    private String email;

    private String phone;

    private String address;
}
