package chapter2;

/*
	A Scanner to read floating-points, type cast it to a Integer and then to a byte.
	Author: Josias JJ Oberholster.
	Chapter 2 exercise 2
	Last Changed: 26 March 2017
*/

import java.util.Scanner;

public class ExerciseTwo {

	public static void main(String[] args){
		
		Scanner keyScan = new Scanner(System.in);
		
		System.out.println("This program will have the following functions,"
				         + "\nFirst - It will read a decimal number supplied by the user,"
				         + "\nSecond - The decimal number will be type cast to a singular number(Integer),"
				         + "\nThird - The decimal number will be type cast to a byte.");
		
		System.out.println("\nThe numbers will be labeled as folllowing: "
				         + "\nx - will be the number supplied"
						 + "\ny - will be x type cast to a singular number(Integer)"
				         + "\nz - will be x type cast to a byte");
		
		System.out.println("\nEnter a decimal number.");
		float x = keyScan.nextFloat();
		
		int y = (int) x;
		
		System.out.println("\nThis program will type cast " + x + " to a singular number(Integer)");
		System.out.println("x is: " + x);
		System.out.println("y is: " + y);
		
		byte z = (byte) x;
		
		System.out.println("\nThis program will type cast " + x + " to a byte");
		System.out.println("x is: " + x);
		System.out.println("z is: " + z);
	}
}
