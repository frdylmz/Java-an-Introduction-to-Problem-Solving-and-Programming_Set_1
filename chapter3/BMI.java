package chapter3;

/*
	This is a program that is designed after the BMI calculation.
	Author: Josias JJ Oberholster.
	Chapter 3 Listing 3.4.
	Last Changed: 2 April 2017.
 */

import java.util.Scanner;

public class BMI {

	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		
		int pounds, feet, inches;
		double heightMeters, mass, BMI;
		
		System.out.println("Enter your weight in pounds.");
		pounds = keyboard.nextInt();
		
		System.out.println("\nEnter your height in feet"
						 + "\nfollowed by a space"
						 + "\nthen additional inches.");
		feet = keyboard.nextInt();
		inches = keyboard.nextInt();
		
		heightMeters = ((feet * 12) + inches) * 0.0254;
		mass = (pounds / 2.2);
		BMI = mass / (heightMeters * heightMeters);
		
		System.out.println("\nYour BMI is " + BMI);
		System.out.print("Your risk category is ");
		if(BMI < 18.5){
			System.out.println("Underweight.");
		}else if(BMI < 25){
			System.out.println("Normal weight.");
		}else if(BMI < 30){
			System.out.println("Overweight.");
		}else{
			System.out.println("Obese.");
		}	
	}
}