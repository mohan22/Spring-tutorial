package com.springtest;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

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

	public Point getCenter() {
		return center;
	}

	@Resource(name = "pointC")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Circle Point is :(" + center.getX() + "," + center.getY() + ")");

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
