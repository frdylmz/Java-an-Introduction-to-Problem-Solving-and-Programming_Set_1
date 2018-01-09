package chapter2;

/**
	Program that displays a whole number supplied by user.
	Author: Josias JJ Oberholster.
	Chapter 2.5 Self-Test Questions.
	Last Changed: 23 March 2017.
 */

import javax.swing.JOptionPane;

public class WholeNumber extends JOptionPane {
	
	public static void main(String[] args){
		
		String userNaumber = JOptionPane.showInputDialog("Enter a whole number");
		int wholeNumber = Integer.parseInt(userNaumber);
		
		JOptionPane.showMessageDialog(null, "The number is: " + wholeNumber);
		
		System.exit(0);
	}
}
