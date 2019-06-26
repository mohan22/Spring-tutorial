package com.springtest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	static Log log = LogFactory.getLog(MainApp.class.getName());

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		context.registerShutdownHook();
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();

	}

}
