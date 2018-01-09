package chapter2;

import java.util.Scanner;

/**
 	Program to compute area of a circle.
 	Author: Josias JJ Oberholster.
 	Programming Assignment 2.
 	Last Change: 22 March 2017.
 */

public class CircleCalculation2 {
	
	public static final double PI = 3.14159;
	
	public static void main(String[] args){
		
		double radius; // in mm
		double area; // in square mm
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the radius of a circle in mm");
		radius = keyboard.nextDouble();
		area = PI * radius * radius;
				
		System.out.println("\nA circle of radius " + radius + " mm");
		System.out.println("Has an area of " + area + " square mm.");
	}
}
