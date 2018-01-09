package chapter2;

/*
	Author: Josias JJ Oberholster.
	Chapter 2 exercise 7
	Last Changed: 27 March 2017
*/

import java.util.Scanner;

public class ExerciseSeven {

	public static void main(String[] args){
	
		Scanner keyScan = new Scanner(System.in);
		
		System.out.println("This program will ask for three diffrent words,"
		+ "it will then give you the first word seperately.");
		
		System.out.println("\nEnter three diffrent words.");
		String words = keyScan.nextLine();
		
		int space = words.indexOf(" ");
		
		String subWord = words.substring(0, space);
		
		System.out.println("\nThe first word is: " + subWord);
	}
}
