package chapter2;

/*
	This program ask the user to supply a radius[inches],
	and depth[feet] to do the sum of how much water a well
	will have.
<<<<<<< HEAD
	Author: Josias JJ Oberholster.
=======
<<<<<<< HEAD
	Author: Josias JJ Oberholster.
=======
	Author: Josias JJ Oberhoslter.
>>>>>>> origin/master
>>>>>>> origin/master
	Chapter 2 Project 12
	Last Changed: 30 March 2017.
*/

import java.util.Scanner;

public class Project12 {

	public static final double PI = 3.142;
	
	public static void main(String[] args){
		
		Scanner keyScan = new Scanner(System.in);
		
		System.out.println("This program ask the user to supply a radius[inches],"
						 + "\nand depth[feet] to do the sum of how much water a well"
						 + "\nwill have.");
		
		System.out .println("\nEnter the depth of the well [in feet]");
		double depth = keyScan.nextDouble();
		
		System.out.println("\nEnter the radius of the well [inches]");
		double radius = keyScan.nextDouble();
		double inchToFeet = radius / 12;
		
		double volume = PI * (inchToFeet * inchToFeet) * depth;
		double galloons = volume * 7.48;
		
		System.out.println("\nThe well can hold up to " + galloons + " gallons of water");
	}
}
