package chapter2;

import java.util.Scanner;

public class ScannerDemo {
	
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter two whole number");
		System.out.println("seperated by one or more spcaes: ");
		
		int n1, n2;
		
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();
		System.out.println("You entered " + n1 + " and " + n2);
		
		System.out.println("\nNext enter two numbers.");
		System.out.println("A decimal point is OK.");
		
		double d1, d2;
		
		d1 = keyboard.nextDouble();
		d2 = keyboard.nextDouble();
		System.out.println("You entered " + d1 + " and " + d2);
		
		System.out.println("\nNext Enter two words:");
		
		String s1, s2;
		
		s1 = keyboard.next();
		s2 = keyboard.next();
		System.out.println("You entered \"" + s1 + "\" and \"" + s2 + "\"");
		
		s1 = keyboard.nextLine();
		
		System.out.println("\nNext enter a line of text");
		
		s1 = keyboard.nextLine();
		System.out.println("You entered: \"" + s1 + "\"");
	}
}
