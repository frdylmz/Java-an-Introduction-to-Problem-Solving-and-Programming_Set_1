package chapter2;

import java.util.Scanner;

public class EggBasket2 {
	
	public static void main(String[] args){
		
		int numberOfBaskets, eggsPerBasket, totalEggs;
		
		Scanner keyboard  = new Scanner(System.in);
		System.out.println("Enter the number of eggs in each basket:");
		eggsPerBasket = keyboard.nextInt();
		System.out.println("Enter the number of baskets:");
		numberOfBaskets = keyboard.nextInt();
		
		totalEggs = numberOfBaskets * eggsPerBasket;
		
		System.out.println("If you have");
		System.out.println(eggsPerBasket + " eggs per basket and");
		System.out.println(numberOfBaskets + " baskets, then");
		System.out.println("\nThe total amount of eggs is " + totalEggs);
		
		System.out.println("\nNow we take two eggs out of each basket.");
		
		eggsPerBasket = eggsPerBasket - 2;
		totalEggs = numberOfBaskets * eggsPerBasket;
		
		System.out.println("\nYou now have");
		System.out.println(eggsPerBasket + " eggs per basket and");
		System.out.println(numberOfBaskets + " baskets.");
		System.out.println("\nThe new total number of eggs is " + totalEggs);
	}
}
