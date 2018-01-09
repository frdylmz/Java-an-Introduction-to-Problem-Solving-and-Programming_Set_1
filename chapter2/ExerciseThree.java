package chapter2;

/*
	A Scanner to read a floating-point(x), it will the use the %
	function to determine the value of y. Secondly it will take x,
	type cast it to a Integer, the us the % function to determine z. 
	Author: Josias JJ Oberholster.
	Chapter 2 exercise 3
	Last Changed: 26 March 2017
*/

import java.util.Scanner;

public class ExerciseThree {

	public static void main(String[] args){
		
		Scanner keyScan = new Scanner(System.in);
		
		System.out.println("The following program will produce the following funcitons: "
						 + "First: Take a user number."
						 + "Second: Use the %2 function to find the remainder."
						 + "Third: Re-use the user number, and cast it a Integer."
						 + "Fourth: Use the %2 function to find the remainder.");
		
		System.out.println("\nThe number will be labled as following:"
						 + "x : User number."
						 + "y : The remainder of %2"
						 + "z : After the type cast, it will be the remainder of %2");
		
		System.out.println("\nEnter a decimal number");
		float x = keyScan.nextFloat();
		
		float y = x % 2;
		int z = (int) x;
		z = z % 2;
		
		System.out.println("\nx is " + x
				         + "\ny is " + y
				         + "\nz is " + z);
	}
}
