package chapter3;

/*
	This program will test if two Strings are equal.
	Author: Josias JJ Oberholster.
	Chapter 3 Listing 3.2.
	Last Changed: 2 April 2017.
 */

import java.util.Scanner;

public class StringEqualityDemo {

	public static void main(String[] args){
		
		String s1, s2;
		
		System.out.println("Enter two lines of text:");
		Scanner keyboard = new Scanner(System.in);
		
		s1 = keyboard.nextLine();
		s2 = keyboard.nextLine();
		
		
		System.out.println("\n" + s1 + ".equals(" + s2 + ") - Test");
		if(s1.equals(s2)){
			System.out.println("The two lines are equal.");
		}else{
			System.out.println("The two lines are not equal.");
		}
		
		System.out.println("\n" + s2 + ".equals(" + s1 + ") - Test");
		if(s1.equals(s2)){
			System.out.println("The two lines are equal.");
		}else{
			System.out.println("The two lines are not equal.");
		}
		
		System.out.println("\n" + s1 + ".equalsIgnoreCase(" + s2 + ") - Test");
		if(s1.equalsIgnoreCase(s2)){
			System.out.println("The two lines are equal.");
		}else{
			System.out.println("The two lines are not equal.");
		}
	}
}
