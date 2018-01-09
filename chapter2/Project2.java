package chapter2;

/*
	This program will read 2 Strings, give their length, then add them together and giver
	the third one's String.
<<<<<<< HEAD
	Author: Josias JJ Oberholster.
=======
<<<<<<< HEAD
	Author: Josias JJ Oberholster.
=======
	Author: Josias JJ Oberhoslter.
>>>>>>> origin/master
>>>>>>> origin/master
	Chapter 2 Project 2
	Last Changed: 27 March 2017.
*/

import java.util.Scanner;

public class Project2 {

	public static void main(String[] args){
		
		Scanner keyScan = new Scanner(System.in);
		
		System.out.println("This program will ask for two Strings,"
						 + "then display them with their length."
						 + "The program will then add the two strings,"
						 + "separate them by a space and then give the new length.");
		
		System.out.println("\nEnter the first String [Word]");
		String wordOne = keyScan.next();
		
		System.out.println("\nEnter the second String [Word]");
		String wordTwo = keyScan.next();
		
		int oneLength = wordOne.length();
		int twoLength = wordTwo.length();
		
		System.out.println("\nFirst String: " + wordOne + ". Length: " + oneLength);
		System.out.println("Second String: " + wordTwo + ". Length: " + twoLength);
		
		String wordThree = wordOne+ " " + wordTwo;
		int threeLength = wordThree.length();
		
		System.out.println("Thrid String: " + wordThree+ ". Length: " + threeLength);
	}
}
