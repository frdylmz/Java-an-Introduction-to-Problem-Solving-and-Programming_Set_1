package chapter1;

import java.util.Scanner;

public class FirstProgramBetter {
	
public static void main(String[] args){
		
		System.out.println("Hello out there");
		System.out.println("I will add three numbers for you");
		System.out.println("Enter three whole number(s) each on their own line");
		
		int n1, n2, n3;
		
		Scanner keybaord = new Scanner(System.in);
		
		System.out.println("\n" + "Please insert first number(s)");
		n1 = keybaord.nextInt();
		
		System.out.println("\n" + "Please insert second number(s)");
		n2 = keybaord.nextInt();
		
		System.out.println("\n" + "Please insert third number(s)");
		n3 = keybaord.nextInt();
		
		System.out.println("\n" + "The sum of these three numbers is:");
		System.out.println(n1 + n2 + n3);
	}
}
