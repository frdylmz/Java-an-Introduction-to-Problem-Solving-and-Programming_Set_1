package chapter2;

/*
	This program takes a one dollar bill and
	deduct the price of an  item, with that in
	mind, it will then give exact change back.
	Author: Josias JJ Oberhoslter.
	Chapter 2 Project 14
	Last Changed: 30 March 2017.
*/

import javax.swing.JOptionPane;

public class ProjectFourteen extends JOptionPane {

	public static void main(String[] args){
		
		int bill = 100;
		int change, halfDollar, quarter, dime, nickel;
		
		String inputPrice = JOptionPane.showInputDialog("Enter price of item"
													  + "\nThe amount should no less than 5 and no more than 100"
													  + "\nThe price should work in 5-cent increment [5, 10 , etc]");
		int price = Integer.parseInt(inputPrice);
		
		change = bill - price;
		
		halfDollar = change / 50;
		change = change % 50;
		
		quarter = change / 25;
		change = change % 25;
		
		dime = change / 10;
		change = change % 10;
		
		nickel = change / 5;
		change = change % 5;
		
		JOptionPane.showMessageDialog(null, "Half-Dollar: " + halfDollar
									+ "\nQuarter(s): " + quarter
									+ "\nDime(s): " + dime
									+ "\nDime(s): " + nickel);
		
		System.exit(0);
	}
}
