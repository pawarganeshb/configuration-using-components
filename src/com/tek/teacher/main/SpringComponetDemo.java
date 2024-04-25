package com.tek.teacher.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tek.teacher.Order;
import com.tek.teacher.Product;
import com.tek.teacher.Student;

public class SpringComponetDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		//1. IOC COntainer 
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		//Provide information of packages 
		// Scanning all @component classes
		
		//context.scan("com.tek.*", "com.infosys.*");
		context.register(BeanConfiguration.class);
		context.refresh();
		
		Product product = 	context.getBean(Product.class);
		System.out.println(product);
		
		Product product2 = (Product) context.getBean("product1");
		System.out.println(product2);
		
		Student stu = context.getBean(Student.class);
		System.out.println(stu);
		
		//Order Object Configured via Configuration class and Bean Method 
		Order order = (Order )context.getBean("order2");
		System.out.println(order);

	}

}
