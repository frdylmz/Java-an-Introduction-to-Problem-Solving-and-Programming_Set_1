package chapter2;

/*
	This program will convert degrees from
	Fahrenheit to Celsius.
	Author: Josias JJ Oberhoslter.
	Chapter 2 Project 6
	Last Changed: 29 March 2017.
*/

import java.util.Scanner;

public class ProjectSix {

	public static void main(String[] args){
		
		Scanner keyScan = new Scanner(System.in);
		
		System.out.println("This program will convert degrees from "
						 + "\nFahrenheit to Celsius.");
		
		System.out.println("\nEnter a temperature in degrees Farenheid.");
		double degreesF = keyScan.nextDouble();
		
		double degreesC = 5 * (degreesF - 32) / 9;
		double roundDegreesC = (double) Math.round(degreesC * 10) / 10d;
		
		System.out.println("");
		System.out.println(degreesF + " degrees Fahrenheit is " + roundDegreesC + " degrees Celsius");
	}
}
