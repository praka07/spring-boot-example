/**
 * 
 */
package com.tcs.demo.springboot.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.demo.springboot.model.EmployeeVO;
import com.tcs.demo.springboot.service.EmployeeManagementService;

/**
 * @author Prakash
 *
 */
@RestController
public class ApplicationController {
	
	@Autowired
	EmployeeManagementService serviceObj;
	
	@GetMapping(value="/getemployee", produces=MediaType.APPLICATION_JSON_VALUE)
	public EmployeeVO getEmployeeDetails(@PathParam("employeeId") int id) {
		return serviceObj.fetchEmployeeDetails(id);
		
	}

}
