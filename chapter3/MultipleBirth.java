package chapter3;

/*
	This program uses a switch statement and gives results
	depending on the number of babies.
	Author: Josias JJ Oberholster.
	Chapter 3 Listing 3.5.
	Last Changed: 11 April 2017.
 */

import java.util.Scanner;

public class MultipleBirth {

	public static void main(String[] args){
		
		int numberOfBabies;
		
		System.out.print("Enter number of babies: ");
		Scanner keyboard = new Scanner(System.in);
		
		numberOfBabies = keyboard.nextInt();
		System.out.println("");
		
		switch(numberOfBabies){
		
		case 0:
			System.out.println("Sorry to hear that.");
			break;
		
		case 1:
			System.out.println("Congratulations.");
			break;
			
		case 2:
			System.out.println("Wow. Twins!");
			break;
			
		case 3:
			System.out.println("Wow. Triplets!");
			break;
		
		case 4:
		case 5:
			System.out.println("Unbelievable; ");
			System.out.println(numberOfBabies + " babies");
			break;
			
		default:
			System.out.println("I don't believe you.");
			break;
		}
	}
}
