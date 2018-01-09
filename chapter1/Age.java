package chapter1;

import java.util.Scanner;

public class Age {
	
	public static void main(String[] args){
		
		int age;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please inser age");
		
		age = scan.nextInt();
		
		System.out.println("Your age is: " + age);
	}
}
