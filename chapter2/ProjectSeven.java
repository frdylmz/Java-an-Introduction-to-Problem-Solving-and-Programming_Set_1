package chapter2;

/*
	This program will change the first occurrence of
	the word 'hate', and change it to 'love'.
	Author: Josias JJ Oberhoslter.
	Chapter 2 Project 7
	Last Changed: 29 March 2017.
*/

import java.util.Scanner;

public class ProjectSeven {

	public static void main(String[] args){
		
		Scanner keyScan = new Scanner(System.in);
		
		System.out.println("This program will change the first occurrence of"
						 + "\n the word 'hate', and change it to 'love'.");
		
		System.out.println("\nEnter a phrase that contains the word 'hate' in it.");
		String sentence = keyScan.nextLine();
		
		String replace = sentence.replaceFirst("hate", "love");
		
		System.out.println("\nYour sentence is : " + replace);
	}
}
