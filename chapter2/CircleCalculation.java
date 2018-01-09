package chapter2;

import java.util.Scanner;

/**
	Program to compute are of a circle.
	Author: Josias JJ Oberholster.
	Programming Assignment 2.
	Last Changed: 22 March 2017.
*/

public class CircleCalculation {
	
	public static void main(String[] args){
		
		double radius; //in mm
		double area; //in square mm
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the radius of a circle in mm");
		
		radius = keyboard.nextDouble();
		area = 3.14159 * radius * radius;
		
		System.out.println("\nA circle of radius " + radius + " mm");
		System.out.println("has an area of " + area + " square mm.");
	}
}
