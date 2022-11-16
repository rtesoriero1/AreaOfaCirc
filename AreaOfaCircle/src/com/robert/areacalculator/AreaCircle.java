package com.robert.areacalculator;

public class AreaCircle {
	
	static double area;
	static double radius = 10;
	static double pi = 3.14; 
	
	public static void main(String[] args) {
		calcAreaOfCircle(pi, radius);
		displayArea();
	}
	
	public static void calcAreaOfCircle (double x, double y) {
		area = x * (y * y);
	}
	
	public static void displayArea(){
		System.out.println(area);
	}
	
}
