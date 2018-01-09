package chapter2;

/*
	This program will ask the user a series
	of questions, based on the answers, the 
	program will the add them to a existing 
	sentence.
	Author: Josias JJ Oberhoslter.
	Chapter 2 Project 9
	Last Changed: 29 March 2017.
*/

import java.util.Scanner;

public class ProjectNine {

	public static void main(String[] args){
		
		Scanner keyScan = new Scanner(System.in);
		
		System.out.println("This program will ask the you a series "
						 + "\nof questions, based on the answers, the "
						 + "\nprogram will the add them to a existing "
						 + "\nsentence.");
		
		System.out.println("\nEnter your favorite colour [lowercase]");
		String wordOne = keyScan.next();
		
		System.out.println("\nEnter your favorite food [lowercase]");
		String wordTwo = keyScan.next();
		
		System.out.println("\nEnter your favorite Animal [lowercase]");
		String wordThree = keyScan.next();
		
		System.out.println("\nEnter the first name of a friend or relative [uppercase]");
		String wordfour = keyScan.next();
		
		System.out.println("\nI had a dream that " + wordfour + " ate a " + wordOne + " " + wordThree + " "
				          + "\nand said it tastes like " + wordTwo + "!");
	}
}
