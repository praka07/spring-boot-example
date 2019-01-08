/**
 * 
 */
package com.tcs.demo.springboot.service;

import com.tcs.demo.springboot.model.EmployeeVO;

/**
 * @author Prakash
 *
 */
public interface EmployeeManagementService {

	public EmployeeVO fetchEmployeeDetails(int id);
}
