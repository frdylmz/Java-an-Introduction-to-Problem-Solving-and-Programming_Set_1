package chapter3;

/*
	This program will read 3 nonnegative integers and place them in 
	increasing order.
	Author: Josias JJ Oberholster.
	Chapter 3 Project 2.
	Last Changed: 18 April 2017. 
 */

import javax.swing.JOptionPane;

public class Project2 extends JOptionPane{

	public static void main(String[] args){
		
		int startProgram = JOptionPane.showConfirmDialog(null, "This program will read 3 nonnegative integers and place them in "
														+ "increasing order. \nProceed?", "", JOptionPane.YES_NO_OPTION);
		
		if(startProgram == YES_OPTION){
			String firstNumber = JOptionPane.showInputDialog("Input first nonnegative number");
			int numberOne = Integer.parseInt(firstNumber);
			
			String secondNumber = JOptionPane.showInputDialog("Input second nonnegative number");
			int numberTwo = Integer.parseInt(secondNumber);
			
			String thirdNumber = JOptionPane.showInputDialog("Input third nonnegative number");
			int numberThree = Integer.parseInt(thirdNumber);
			
			if(numberOne < numberTwo && numberOne < numberThree){
				if(numberTwo < numberThree){
					JOptionPane.showMessageDialog(null, numberOne + "\n" + numberTwo + "\n" + numberThree);
				}else{
					JOptionPane.showMessageDialog(null, numberOne + "\n" + numberThree + "\n" + numberTwo);
				}
			}else if(numberTwo < numberOne && numberTwo < numberThree){
				if(numberOne < numberThree){
					JOptionPane.showMessageDialog(null, numberTwo + "\n" + numberOne + "\n" + numberThree);
				}else{
					JOptionPane.showMessageDialog(null, numberTwo + "\n" + numberThree + "\n" + numberOne);
				}
			}else if(numberThree < numberOne && numberThree < numberTwo){
				if(numberOne < numberTwo){
					JOptionPane.showMessageDialog(null, numberThree + "\n" + numberOne + "\n" + numberTwo);
				}else{
					JOptionPane.showMessageDialog(null, numberThree + "\n" + numberTwo + "\n" + numberOne);
				}
			}	
		}else if(startProgram == NO_OPTION){
			System.exit(0);
		}else{
			System.out.println("an error has occurred!");
			System.exit(0);
		}
		
		System.exit(0);
	}
}
