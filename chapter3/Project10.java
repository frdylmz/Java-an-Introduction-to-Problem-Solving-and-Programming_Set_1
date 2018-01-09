package chapter3;

/*
	Using the BMR sum, this program will tell
	the user the number of chocolates he/she can
	eat to maintain one's weight for both male
	and female.
	Author: Josias JJ Oberholster.
	Chapter 3 Project 10
	Last Changed: 20 April 2017.
*/

import javax.swing.JOptionPane;

public class Project10 extends JOptionPane{

	public static void main(String[] args){
		
		int startProgram = JOptionPane.showConfirmDialog(null, "Using the BMR sum, this program will tell"
														+ "\nthe user the number of chocolates he/she can"
														+ "\neat to maintain one's weight for either male"
														+ "\nor female.", "BMR Calculator"
														+ "\n\nProceed", JOptionPane.YES_NO_OPTION);
		
		if(startProgram == YES_OPTION){
			String gender = JOptionPane.showInputDialog(null, "Please specify if you male or female"
														+ "\nNote: After specifying gender, please fill"
														+ "\nall other questions using numbers without decimal.");
			
			if(gender.equalsIgnoreCase("male")){
				String sWeight = JOptionPane.showInputDialog(null, "Enter your weight"
															+ "\n[In Pounds]");
				int weight = Integer.parseInt(sWeight);
				
				String sHeight = JOptionPane.showInputDialog(null, "Enter your height"
															+ "\n[In inches]");
				int height = Integer.parseInt(sHeight);
				
				String sAge = JOptionPane.showInputDialog(null, "Enter your age"
														+ "\n[In years]");
				int age = Integer.parseInt(sAge);
				
				double maleBMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
				int mChoc = (int) (maleBMR / 230);
				
				JOptionPane.showMessageDialog(null, "To maintain your weight without exercise you will need"
											 + "\nto eat this many chocolate bars:"
											 + "\n" + mChoc);
			}else if(gender.equalsIgnoreCase("female")){
				String sWeight = JOptionPane.showInputDialog(null, "Enter your weight"
															+ "\n[In Pounds]");
				int weight = Integer.parseInt(sWeight);
				
				String sHeight = JOptionPane.showInputDialog(null, "Enter your height"
															+ "\n[In inches]");
				int height = Integer.parseInt(sHeight);
				
				String sAge = JOptionPane.showInputDialog(null, "Enter your age"
														+ "\n[In years]");
				int age = Integer.parseInt(sAge);
				
				double femaleBMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
				int fChoc = (int) (femaleBMR / 230);
				
				JOptionPane.showMessageDialog(null, "To maintain your weight without exercise you will need"
											 + "\nto eat this many chocolate bars:"
											 + "\n" + fChoc);
			}else{
				System.out.println("Error at choosing gender");
				System.exit(0);
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