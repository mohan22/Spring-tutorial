package com.springtest;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		context.registerShutdownHook();
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		// obj.getMessage();
		Triangle tri = (Triangle) context.getBean("triangle");
		tri.draw();

	}

}
