package com.mondee;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

public class EmployeeDAOImp1 
	extends NamedParameterJdbcDaoSupport implements EmployeeDAO
{
public void insert(Employee employee) {
	String sql="insert into employee "
					+"(employeeId,name,age,salary) values(:employeeId,:name,:age,:salary)";
	Map<String,Object> parameters= new HashMap<String,Object>();
	parameters.put("employeeId", employee.getEmployeeId());
	parameters.put("name", employee.getName());
	parameters.put("age", employee.getAge());
	parameters.put("salary", employee.getSalary());
	
	getNamedParameterJdbcTemplate().update(sql, parameters);
}
}
