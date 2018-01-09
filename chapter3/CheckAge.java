package chapter3;

/*
	This is a simple program to check if the user is
	of age to proceed.
	Author: Josias JJ Oberholster.
	Chapter 3 Self-Test Question 23
	Last Changed: 12 April 2017
 */

import javax.swing.JOptionPane;

public class CheckAge extends JOptionPane {

	public static void main(String[] args){
		
		int adult = JOptionPane.showConfirmDialog(null, "Are you atleast 18 years of age or older?", "Please confirm age",  YES_NO_OPTION);
		
		if(adult == JOptionPane.YES_OPTION){
			JOptionPane.showMessageDialog(null, "You are of age to proceed.");
			System.exit(0);
		}else if(adult == JOptionPane.NO_OPTION){
			JOptionPane.showMessageDialog(null, "Access Denied");
			System.exit(0);
		}else{
			System.out.println("An error has occured");
		}
		
		System.exit(0);
	}
}
