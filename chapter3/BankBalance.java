package chapter3;

/*
	This program will check if you have enough money in your
	account, if true it will add interest, if false then 
	the overdraft will push it even more into the negative.
	Author: Josias JJ Oberholster.
	Chapter 3 Listing 3.1
	Last Changed: 2 April 2017.
 */

import java.util.Scanner;

public class BankBalance {

	public static final double OVERDRAWN_PENALTY = 8.00;
	public static final double INTEREST_RATE = 0.02; //2% annually
	
	public static void main(String[] args){
		
		double balance;
		
		System.out.println("Enter your checking account balance: R");
		Scanner keyboard = new Scanner(System.in);
		
		balance = keyboard.nextDouble();
		
		System.out.println("\nOriginal balance: R" + balance);
		
		if(balance >= 0){
			
			balance = balance + (INTEREST_RATE * balance) / 12;
		}else{
			
			balance = balance - OVERDRAWN_PENALTY;
		}
		
		System.out.println("\nAfter adjusting for one month ");
		System.out.println("of interest and penalties,");
		System.out.println("your new balance is R" + balance);
	}
}
