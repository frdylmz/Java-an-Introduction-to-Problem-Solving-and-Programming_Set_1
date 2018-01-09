package chapter3;

/*
	This program takes a one dollar bill and
	deduct the price of an  item, with that in
	mind, it will then give exact change back.
	Author: Josias JJ Oberholster.
	Chapter 3 Project 6
	Last Changed: 19 April 2017.
 */

import javax.swing.JOptionPane;

public class Project6 extends JOptionPane{

	public static void main(String[] args){
		
		int startProgram = JOptionPane.showConfirmDialog(null, "This program takes a one dollar bill and"
														 + "\ndeduct the price of an item, with that in"
														 + "\nmind, it will then give exact change back."
														 + "\n\nProceed?", "Vending Machine", JOptionPane.YES_NO_OPTION);
		
		if(startProgram == YES_OPTION){
			String price = JOptionPane.showInputDialog(null, "Enter the price of the item baught."
													  + "\nThe amount should be no less than 25c and no more than 100c"
													  + "\nThe price should work in 5-cent increment [5, 10 , etc]"
													  + "\n\nEnter price of item:");
			int intPrice = Integer.parseInt(price);
			
			if(intPrice < 25){
				JOptionPane.showMessageDialog(null, "The price can not be under 25c");
				System.exit(0);
			}else if(intPrice % 5 != 0){
				JOptionPane.showMessageDialog(null, "The price must be in 5-cent increment");
				System.exit(0);
			}else if(intPrice > 100){
				JOptionPane.showMessageDialog(null, "Price can not be higher than 100c");
			}else{
				int bill = 100;
				int change, halfDollar, quarter, dime, nickel;
				
				change = bill - intPrice;
				
				halfDollar = change / 50;
				change = change % 50;
				
				quarter = change / 25;
				change = change % 25;
				
				dime = change / 10;
				change = change % 10;
				
				nickel = change / 5;
				change = change % 5;
				
				JOptionPane.showMessageDialog(null, "Your change is as follow:"
											 + "\nHalf-Dollar: " + halfDollar
											 + "\nQuarter(s): " + quarter
											 + "\nDime(s): " + dime
											 + "\nNickle(s): " + nickel);
			}	
			
		}else if(startProgram == NO_OPTION){
			System.exit(0);
		}else{
			System.out.println("Program was force closed");
			System.exit(0);
		}
		System.exit(0);
	}
}
