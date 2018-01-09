package chapter2;

/*
	This program will read 3 whole numbers and display their average.
	Author: Josias JJ Oberhoslter.
	Chapter 2 Project 1
	Last Changed: 27 March 2017.
 */

import java.util.Scanner;

public class ProjectOne {

	public static void main(String[] args){
		
		Scanner keyScan = new Scanner(System.in);
		
		System.out.println("This program will take three whole numbers, "
						 + "and display the average of the three.");
		
		System.out.println("\nEnter the first whole number");
		int numberOne = keyScan.nextInt();
		
		System.out.println("\nEnter the second number");
		int numberTwo = keyScan.nextInt();
		
		System.out.println("\nEnter the third number");
		int numberThree = keyScan.nextInt();
		
		int average = (numberOne + numberTwo + numberThree);
				
		System.out.println("\nNumber one: " + numberOne
						 + "\nNumber two: " + numberTwo
						 + "\nNumber three: " + numberThree);
		System.out.println("Number Average: " + average);
	}
}
