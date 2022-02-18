package com.mondee;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainLogic
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		EmployeeDAO employeeDAO = (EmployeeDAO) context
				.getBean("employeeDAO");
		Employee employee = new Employee(1, "sailaxmi", 21, 80000);
		employeeDAO.insert(employee);
		System.out.println("Employee record inserted successfully.");
		
	
	}
}