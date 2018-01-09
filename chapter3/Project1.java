package chapter3;

/*
	This program will check if one number is divisible by
	a second number.
	Author: Josias JJ Oberholster.
	Chapter 3 Project 1
	Last Changed: 18 April 2017.
 */

import javax.swing.JOptionPane;

public class Project1 extends JOptionPane{

	public static void main(String[] args){
		
		String confirm;
		
		int programStart = JOptionPane.showConfirmDialog(null, "This program will check if one number is divisible by a second number. \nProceed?", 
														"", JOptionPane.YES_NO_OPTION);
		
		if(programStart == YES_OPTION){
			String firstNumber = JOptionPane.showInputDialog("Enter the first number");
			int numberOne = Integer.parseInt(firstNumber);
			
			String secondNumber = JOptionPane.showInputDialog("Enter the second number");
			int numberTwo = Integer.parseInt(secondNumber);
					
			if(numberOne % numberTwo == 0){
				int answer = numberOne / numberTwo;
				confirm = numberOne + " is divisible by " + numberTwo 
						  + "\nThe answer is: " + answer;
			}else{
				confirm = numberOne + " is not divisible by " + numberTwo;
			}
					
			JOptionPane.showMessageDialog(null, confirm);		
							
		}else if(programStart == NO_OPTION){
			System.exit(0);
		}else{
			System.out.println("an error has occurred!");
			System.exit(0);
		}
		
		System.exit(0);
	}
}
