package com.springcore.autowireing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
	ApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/autowireing/config.xml");
	Emp e1  = (Emp)context.getBean("emp");//context.getBean("emp" Emp.class) yese bhi type cast kter skjte her
	System.out.println(e1);
		
}
}