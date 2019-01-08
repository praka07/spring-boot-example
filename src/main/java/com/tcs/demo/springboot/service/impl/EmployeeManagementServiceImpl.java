/**
 * 
 */
package com.tcs.demo.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.demo.springboot.dao.impl.EmployeeDAOImpl;
import com.tcs.demo.springboot.model.EmployeeVO;
import com.tcs.demo.springboot.service.EmployeeManagementService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Prakash
 *
 */
@Service
@Slf4j
public class EmployeeManagementServiceImpl implements EmployeeManagementService {

	@Autowired
	EmployeeDAOImpl daoImplObj;
	
	@Override
	public EmployeeVO fetchEmployeeDetails(int id) {
		
		EmployeeVO obj=daoImplObj.getEmployeeDetails(id);
		log.info("Employee Obj::{}",obj);
		return obj;
		
	}

}
