package com.springtest;

import org.springframework.context.ApplicationContext;

public class Triangle implements Shape {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Point A= (" + getPointA().getX() + "," + getPointA().getY() + ")" + "Point B= ("
				+ getPointB().getX() + "," + getPointB().getY() + ")" + "Point C= (" + getPointC().getX() + ","
				+ getPointC().getY() + ")");
	}

	public void myInit() {
		System.out.println("my init");
	}

	public void myDestroy() {
		System.out.println("my destroy");
	}

}
