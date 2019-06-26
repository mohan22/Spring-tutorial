package com.springtest;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;

//component annotation makes this class as bean
/*Stereotypes :
@Service for services
@Repository for data
@Controller for controller objects(MVC)
*/
//
@Controller
public class Circle implements Shape {

	private Point center;

	@Autowired
	private MessageSource messageSource;

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getCenter() {
		return center;
	}

	@Resource(name = "pointC")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println(messageSource.getMessage("greeting", null, "Default Hey", null));
		System.out.println(messageSource.getMessage("drawing.circle", new Object[] { center.getX(), center.getY() },
				"Default msg", null));

	}

	@PostConstruct
	public void initCicle() {
		System.out.println("init circle");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy circle");
	}

}
