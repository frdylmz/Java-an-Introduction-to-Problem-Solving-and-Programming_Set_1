package chapter1;

import java.util.Scanner;

public class BirthdayWizard {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please supply year of birth:");
		int year = scan.nextInt();
		
		System.out.println("\nTo see at what year you would be what age, please supply your age:");
		int age = scan.nextInt();
		
		int sum = year + age;
		
		System.out.println("\nWhen you are " + age + " , the year will be: " + sum);
	}
}
