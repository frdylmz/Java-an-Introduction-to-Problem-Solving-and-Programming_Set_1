package chapter2;

/*
	Author: Josias JJ Oberholster.
	Chapter 2 exercise 8
	Last Changed: 27 March 2017
*/

import java.util.Scanner;

public class ExerciseEight {
	
	public static void main(String[] args){
		
		Scanner keyScan = new Scanner(System.in);
		
		System.out.println("This program will ask for three diffrent words,"
		+ "it will then give you the Second word seperately.");
		
		System.out.println("\nEnter three diffrent words.");
		String words = keyScan.nextLine();
		
		int firstPos = words.indexOf(" ");
		int lastPos = words.indexOf(" ", firstPos + 1);
		
		String selectedWord = words.substring(firstPos, lastPos);
		
		System.out.println("The second word is : " + selectedWord);
	}
}
