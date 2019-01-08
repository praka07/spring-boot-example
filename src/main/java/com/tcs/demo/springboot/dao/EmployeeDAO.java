package com.tcs.demo.springboot.dao;

import com.tcs.demo.springboot.model.EmployeeVO;

/**
 * @author Prakash
 *
 */
public interface EmployeeDAO {
	
	public EmployeeVO getEmployeeDetails(int id);

}
