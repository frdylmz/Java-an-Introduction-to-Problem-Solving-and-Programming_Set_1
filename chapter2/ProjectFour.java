package chapter2;

/*
	This program will reads a four-digit integer,
	and then displays it, one digit per line.
	Author: Josias JJ Oberhoslter.
<<<<<<< HEAD
	Chapter 2 Project 4
=======
<<<<<<< HEAD
	Chapter 2 Project 4
=======
<<<<<<< HEAD
	Chapter 2 Project 4
=======
	Chapter 2 Project 3
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
	Last Changed: 27 March 2017.
*/

import java.util.Scanner;

public class ProjectFour {

	public static void main(String[] args){
		
		Scanner keyScan = new Scanner(System.in);
		
		System.out.println("This program will reads a four-digit integer,"
						 + "and then displays it, one digit per line.");
		
		System.out.println("\nEnter a four digit number.");
		int numbers = keyScan.nextInt();
		
		int firstNumber, secondNumber, thirdNumber, fourthNumber;
		int newNumber = numbers;
		
		firstNumber = newNumber / 1000;
		newNumber = newNumber % 1000;
		
		secondNumber = newNumber / 100;
		newNumber = newNumber % 100;
		
		thirdNumber = newNumber / 10;
		newNumber = newNumber % 10;
		
		fourthNumber = newNumber;
		
		System.out.println("");
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		System.out.println(thirdNumber);
		System.out.println(fourthNumber);
	}
}
