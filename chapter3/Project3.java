package chapter3;

/*
	This program will read three String and display the second one in
	lexicographically order.
 */

import javax.swing.JOptionPane;

public class Project3 extends JOptionPane{

	public static void main(String[] args){
		
		int startProgram = JOptionPane.showConfirmDialog(null, "This program will read three String and display the second one in lexicographically order."
														+ "\nProceed?", "", JOptionPane.YES_NO_OPTION);
		
		if(startProgram == YES_OPTION){
			String firstWord = JOptionPane.showInputDialog("Input first word:");
			String secondWord = JOptionPane.showInputDialog("Input second word");
			String thirdWord = JOptionPane.showInputDialog("Input third word");
			
			if(firstWord.compareTo(secondWord) > 0 && firstWord.compareTo(thirdWord) < 0){
				JOptionPane.showMessageDialog(null, "First Word: " + firstWord + "\nSecond Word: " + secondWord + "\nThird Word: " + thirdWord
											 + "\n\nThe Second word in alphabetical order is: " + firstWord);
			}else if(firstWord.compareTo(thirdWord) > 0 && firstWord.compareTo(secondWord) < 0){
				JOptionPane.showMessageDialog(null, "First Word: " + firstWord + "\nSecond Word: " + secondWord + "\nThird Word: " + thirdWord
						 					  + "\n\nThe Second word in alphabetical order is: " + firstWord);
			}
			
			if(secondWord.compareTo(firstWord) > 0 && secondWord.compareTo(thirdWord) < 0){
				JOptionPane.showMessageDialog(null, "First Word: " + firstWord + "\nSecond Word: " + secondWord + "\nThird Word: " + thirdWord
											  + "\n\nThe Second word in alphabetical order is: " + secondWord);
			}else if(secondWord.compareTo(thirdWord) > 0 && secondWord.compareTo(firstWord) < 0){
				JOptionPane.showMessageDialog(null, "First Word: " + firstWord + "\nSecond Word: " + secondWord + "\nThird Word: " + thirdWord
	 					  					  + "\n\nThe Second word in alphabetical order is: " + secondWord);
			}
			
			if(thirdWord.compareTo(firstWord) > 0 && thirdWord.compareTo(secondWord) < 0){
				JOptionPane.showMessageDialog(null, "First Word: " + firstWord + "\nSecond Word: " + secondWord + "\nThird Word: " + thirdWord
	 					 					  + "\n\nThe Second word in alphabetical order is: " + thirdWord);
			}else if(thirdWord.compareTo(secondWord) > 0 && thirdWord.compareTo(firstWord) < 0){
				JOptionPane.showMessageDialog(null, "First Word: " + firstWord + "\nSecond Word: " + secondWord + "\nThird Word: " + thirdWord
						 					  + "\n\nThe Second word in alphabetical order is: " + thirdWord);
			}			
		}else if(startProgram == NO_OPTION){
			System.exit(0);
		}else{
			System.out.println("an error has occured!");
			System.exit(0);
		}
		
		System.exit(0);
	}
}
