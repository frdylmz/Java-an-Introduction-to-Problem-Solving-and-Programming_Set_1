package chapter2;

/*
	This program will read a users 4-bit binary number
	from the keyboard as a String and then convert it
	into decimal.
<<<<<<< HEAD
	Author: Josias JJ Oberholster.
=======
<<<<<<< HEAD
	Author: Josias JJ Oberholster.
=======
	Author: Josias JJ Oberhoslter.
>>>>>>> origin/master
>>>>>>> origin/master
	Chapter 2 Project 11
	Last Changed: 29 March 2017.
*/

import java.util.Scanner;

public class Project11 {

	public static void main(String[] args){
		
		Scanner keyScan = new Scanner(System.in);
		
		System.out.println("This program will read a users 4-bit binary number"
						 + "\nfrom the keyboard as a String and then convert it"
						 + "\ninto decimal.");
		
		System.out.println("Enter your 4-bit binary number");
		String binary = keyScan.nextLine();
		
		String bitOne = binary.substring(0, 1);
		String bitTwo = binary.substring(1, 2);
		String bitThree = binary.substring(2, 3);
		String bitFour = binary.substring(3, 4);
		
		int dBitOne = Integer.parseInt(bitOne);
		int dBitTwo = Integer.parseInt(bitTwo);
		int dBitThree = Integer.parseInt(bitThree);
		int dBitFour = Integer.parseInt(bitFour);
		
		System.out.println((dBitOne * 8) + (dBitTwo * 4) + (dBitThree * 2) + (dBitFour * 1));
	}
}
