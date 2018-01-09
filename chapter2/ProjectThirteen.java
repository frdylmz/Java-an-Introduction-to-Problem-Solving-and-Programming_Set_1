package chapter2;

/*
	Using the BMR sum, this program will tell
	the user the number of chocolates he/she can
	eat to maintain one's weight for both male
	and female.
	Author: Josias JJ Oberhoslter.
	Chapter 2 Project 13
	Last Changed: 30 March 2017.
*/

import java.util.Scanner;

public class ProjectThirteen {

	public static void main(String[] args){
		
		Scanner keyScan = new Scanner(System.in);
		
		System.out.println("Using the BMR sum, this program will tell"
						 + "\nthe user the number of chocolates he/she can"
						 + "\neat to maintain one's weight for both male"
						 + "\nand female.");
		System.out.println("Note: Enter numbers without a decimal");
		
		System.out.println("\nEnter your weight [Pounds]");
		int weight = keyScan.nextInt();
		
		System.out.println("\nEnter your hight [inches]");
		int height = keyScan.nextInt();
		
		System.out.println("\nEnter your age [years]");
		int age = keyScan.nextInt();
		
		double femaleBMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
		int fChoc = (int) (femaleBMR / 230);
		
		double maleBMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
		int mChoc = (int) (maleBMR / 230);
		
		System.out.println("\nTo maintain your weight without exercise you will need"
						 + "\nto eat this many chocolate bars:");
		System.out.println("\nIf your male: " + mChoc);
		System.out.println("\nIf your female: " + fChoc);
	}
}
