package chapter3;

/*
	This program will take a sentence and give a response for it.
	Author: Josias JJ Oberholster.
	Chapter 3 Project 4.
	Last Changed: 18 APril 2017.
*/

import java.util.Scanner;

public class Project4 {

	public static void main(String[] args){
		
		System.out.println("This program will take a user sentence input and give a response"
						  + "depending on the sentence.");
		
		System.out.println("Enter a sentence:");
		Scanner keyScan = new Scanner(System.in);
		String sentence = keyScan.nextLine();
		
		int sLength = sentence.length();
		String sEnd = sentence.substring(sLength-1, sLength);
		
		if(sEnd.equals("?")){
			if(sLength % 2 == 0){
				System.out.println("\nYES!!!");
			}else if(sEnd.equals("?")){
				System.out.println("\nNO!!!");
			}
		}else if(sEnd.equals("!")){
			System.out.println("\nWOW!!!");
		}else{
			System.out.println("\nYou always say \"" + sentence + "\".");
		}
	}
}
