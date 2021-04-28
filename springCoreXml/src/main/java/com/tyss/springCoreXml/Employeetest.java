package com.tyss.springCoreXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employeetest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("empconfig.xml");
		Employee employee = (Employee) applicationContext.getBean("empTwo");
		System.out.println(employee.getId());
		System.out.println(employee.getName());
	}

}
