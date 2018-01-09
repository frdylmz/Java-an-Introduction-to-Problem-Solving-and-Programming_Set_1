package chapter2;

/*
	This program will change the first word in a sentence,
	and move it to the end of the sentence.
<<<<<<< HEAD
	Author: Josias JJ Oberholster.
=======
<<<<<<< HEAD
	Author: Josias JJ Oberholster.
=======
	Author: Josias JJ Oberhoslter.
>>>>>>> origin/master
>>>>>>> origin/master
	Chapter 2 Project 8
	Last Changed: 29 March 2017.
*/

import java.util.Scanner;

public class Project8 {

	public static void main(String[] args){
		
		Scanner keyScan = new Scanner(System.in);
		
		System.out.println("This program will change the first word in a sentence,"
						 + "\n and move it to the end of the sentence.");
		
		System.out.println("Enter any sentence.");
		String sentence = keyScan.nextLine();
		
		int space = sentence.indexOf(" ");
		String firstWord = sentence.substring(0, space + 1);
		String removeWord = sentence.replaceFirst(firstWord, "");
		
		System.out.println("");
		System.out.println(removeWord + " " + firstWord);
	}
}
