package chapter2;

/*
	This program will reads a four-digit String,
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
	Chapter 2 Project 5
	Last Changed: 29 March 2017.
*/

import java.util.Scanner;

public class Project5 {

	public static void main(String[] args){
		
		Scanner keyScan = new Scanner(System.in);
		
		System.out.println("This program will reads a four-digit String, "
						+  "\nand then displays it, one digit per line.");
		
		System.out.println("\nEnter a four digit number.");
		String numbers = keyScan.nextLine();
		
		String numberOne = numbers.substring(0, 1);
		String numberTwo = numbers.substring(1, 2);
		String numberThree = numbers.substring(2, 3);
		String numberFour = numbers.substring(3);
		
		System.out.println("");
		System.out.println(numberOne);
		System.out.println(numberTwo);
		System.out.println(numberThree);
		System.out.println(numberFour);
	}
}
