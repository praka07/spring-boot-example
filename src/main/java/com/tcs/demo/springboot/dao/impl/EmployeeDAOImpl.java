/**
 * 
 */
package com.tcs.demo.springboot.dao.impl;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.tcs.demo.springboot.dao.EmployeeDAO;
import com.tcs.demo.springboot.model.EmployeeVO;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Prakash
 *
 */
@Repository
@Slf4j
public class EmployeeDAOImpl implements EmployeeDAO {

	//@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public EmployeeVO getEmployeeDetails(int id) {
		/*
		 * import note ID and FIRST_NAME are column name in database where as empId and
		 * firstName are pojo class EmpoyeeVO fields it must match
		 */

		String queryToExecute = "SELECT ID AS empId , FIRST_NAME AS firstName FROM EMPLOYEE_TABLE WERE ID=" + id;
		RowMapper<EmployeeVO> rowMapper = new BeanPropertyRowMapper<EmployeeVO>(EmployeeVO.class);
		EmployeeVO obj = (EmployeeVO) jdbcTemplate.queryForObject(queryToExecute, rowMapper);
		log.info("employee object from databse-->{}", obj);
		return obj;

	}

}
