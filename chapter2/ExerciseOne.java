package chapter2;

/*
	A Scanner to read floating-points.
	Author: Josias JJ Oberholster.
	Chapter 2 exercise 1
	Last Changed: 26 March 2017
 */

import java.util.Scanner;

public class ExerciseOne {
	
	public static void main(String[] args){
		
		Scanner keyScan = new Scanner(System.in);
		
		System.out.println("Enter any number with a decimal point.");		
		float x = keyScan.nextFloat();
		
		float y = (float) 1.0/x;
		
		System.out.println("\nYou selected: " + x);
		System.out.println("1.0 devided by " + x + " equals " + y);
		
		System.out.println("\n1 will be subtracted from " + x + " as well as " + y);
		System.out.println(x + " will be: " + (x - 1));
		System.out.println(y + " will be: " + (y - 1));
	}
}
