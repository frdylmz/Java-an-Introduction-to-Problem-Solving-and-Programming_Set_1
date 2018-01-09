package chapter1;

import java.util.Scanner;

public class FirstProgram {
	
	public static void main(String[] args){
		
		System.out.println("Hello out there");
		System.out.println("I will add two numbers for you");
		System.out.println("Enter two whole numbers on a line");
		
		int n1, n2;
		
		Scanner keybaord = new Scanner(System.in);
		
		System.out.println("\n" + "Please insert first number(s)");
		n1 = keybaord.nextInt();
		
		System.out.println("\n" + "Please insert second number(s)");
		n2 = keybaord.nextInt();
		
		System.out.println("\n" + "The sum of these two numbers is:");
		System.out.println(n1 + n2);
	}
}