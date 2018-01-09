package chapter2;

/*
	This program will read a user input of a year [month/day/year]
	and convert it to a format used in Europe [day.month.year]
	Author: Josias JJ Oberhoslter.
	Chapter 2 Project 15
	Last Changed: 30 March 2017.
	01/34/6789
*/

import javax.swing.JOptionPane;

public class ProjectFifteen extends JOptionPane {

	public static void main(String[] args){
		
		String americanFormat = JOptionPane.showInputDialog("This program will convert a American date format"
														+ "\nto a European date format"
														+ "\nEnter date as month/day/year");
		
		String month = americanFormat.substring(0, 2);
		String day = americanFormat.substring(3, 5);
		String year = americanFormat.substring(6, 10);
		
		String europeFormat = day + "." + month + "." + year;
		String otherFormat = year + "." + month + "." + day;
		
		JOptionPane.showMessageDialog(null, "American format: " + americanFormat
										  + "\nEuropean format: " + europeFormat
										  + "\nOther format: " + otherFormat);
		
		System.exit(0);
	}
}
