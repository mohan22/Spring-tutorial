package com.springtest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	static Log log = LogFactory.getLog(MainApp.class.getName());

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		// obj.getMessage();
		Triangle tri = (Triangle) context.getBean("triangle");
		tri.draw();

		log.info("Exiting the program");

	}

}
