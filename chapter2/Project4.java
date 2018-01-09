package chapter2;

/*
	This program will reads a four-digit integer,
	and then displays it, one digit per line.
<<<<<<< HEAD
	Author: Josias JJ Oberholster.
=======
<<<<<<< HEAD
	Author: Josias JJ Oberholster.
=======
	Author: Josias JJ Oberhoslter.
>>>>>>> origin/master
>>>>>>> origin/master
	Chapter 2 Project 4
	Last Changed: 27 March 2017.
*/

import java.util.Scanner;

public class Project4 {

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
