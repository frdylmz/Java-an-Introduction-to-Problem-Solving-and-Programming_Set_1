package chapter2;

/**
	Program to give exact change.
	Author: Josias JJ Oberholster.
	Chapter 2.5 Listing 2.12.
	Last Changed: 23 March 2017.
 */

import javax.swing.JOptionPane;

public class ChangeMakerWindow extends JOptionPane{

	public static void main(String[] args){
		
		String userNumber = JOptionPane.showInputDialog(
				            "Enter a whole number from 1 to 99\n" +
		                    "I will output a combination of coins\n" + 
				            "that equals the amount of change.");
		int amount = Integer.parseInt(userNumber);
		
		int originalAmount, quarters, dimes, nickles, pennies;
		originalAmount = amount;
		
		quarters = amount / 25;
		amount = amount % 25;
		
		dimes = amount / 10;
		amount = amount % 10;
		
		nickles = amount / 5;
		amount = amount % 5;
		
		pennies = amount;
		
		JOptionPane.showMessageDialog(null, originalAmount + 
				                      " cents in coins can be given as:\n" + 
				                      "Quarters: " + quarters + "\n" + 
				                      "Dimees: " + dimes + "\n" + 
				                      "nickles: " + nickles + "\n" + 
				                      "Pennies: " + pennies);
		
		System.exit(0);
	}
}
