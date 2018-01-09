package chapter3;

/*
	Using the BMR sum, this program will tell
	the user the number of chocolates he/she can
	eat to maintain one's weight for both male
	and female.
	Author: Josias JJ Oberholster.
	Chapter 3 Project 11
	Last Changed: 20 April 2017.
*/

import javax.swing.JOptionPane;

public class Project11 extends JOptionPane{

	public static void main(String[] args){
		
		double maleBMR, femaleBMR, maleExtra;
		int mChoc, fChoc, weight, height, age, active;
		String sWeight, sHeight, sAge, sActive;
		
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
				sWeight = JOptionPane.showInputDialog(null, "Enter your weight"
															+ "\n[In Pounds]");
				weight = Integer.parseInt(sWeight);
				
				sHeight = JOptionPane.showInputDialog(null, "Enter your height"
															+ "\n[In inches]");
				height = Integer.parseInt(sHeight);
				
				sAge = JOptionPane.showInputDialog(null, "Enter your age"
														+ "\n[In years]");
				age = Integer.parseInt(sAge);
				
				sActive = JOptionPane.showInputDialog(null, "Are you"
															+ "\n1. Sedentary?"
															+ "\n2. Somewhat active (Exercise occasionally?"
															+ "\n3. Active (Exercise 3-4 days per week)?"
															+ "\n4. Highly active (Exercise every day)");
				active = Integer.parseInt(sActive);
				
				if(active == 1){
					
					maleBMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
					maleExtra = maleBMR + (maleBMR * 0.2);
					mChoc = (int) (maleExtra / 230);
					
					JOptionPane.showMessageDialog(null, "To maintain your weight without exercise you will need"
							 + "\nto eat this many chocolate bars:"
							 + "\n" + mChoc);
					
				}else if(active == 2){ 
					maleBMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
					maleExtra = maleBMR + (maleBMR * 0.3);
					mChoc = (int) (maleExtra / 230);

					JOptionPane.showMessageDialog(null, "To maintain your weight without exercise you will need"
							 + "\nto eat this many chocolate bars:"
							 + "\n" + mChoc);
				
				}else if(active == 3){ 
					maleBMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
					maleExtra = maleBMR + (maleBMR * 0.4);
					mChoc = (int) (maleExtra / 230);
					

					JOptionPane.showMessageDialog(null, "To maintain your weight without exercise you will need"
							 + "\nto eat this many chocolate bars:"
							 + "\n" + mChoc);
				
				}else if(active == 4){ 
					maleBMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
					maleExtra = maleBMR + (maleBMR * 0.5);
					mChoc = (int) (maleExtra / 230);

					JOptionPane.showMessageDialog(null, "To maintain your weight without exercise you will need"
							 + "\nto eat this many chocolate bars:"
							 + "\n" + mChoc);
				
				}
				
			}else if(gender.equalsIgnoreCase("female")){
				sWeight = JOptionPane.showInputDialog(null, "Enter your weight"
															+ "\n[In Pounds]");
				weight = Integer.parseInt(sWeight);
				
				sHeight = JOptionPane.showInputDialog(null, "Enter your height"
															+ "\n[In inches]");
				height = Integer.parseInt(sHeight);
				
				sAge = JOptionPane.showInputDialog(null, "Enter your age"
														+ "\n[In years]");
				age = Integer.parseInt(sAge);
				
				femaleBMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
				fChoc = (int) (femaleBMR / 230);
				
				sActive = JOptionPane.showInputDialog(null, "Are you"
													 + "\n1. Sedentary?"
													 + "\n2. Somewhat active (Exercise occasionally?"
													 + "\n3. Active (Exercise 3-4 days per week)?"
													 + "\n4. Highly active (Exercise every day)");
				active = Integer.parseInt(sActive);

				if(active == 1){
					
					maleBMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
					maleExtra = maleBMR + (maleBMR * 0.2);
					mChoc = (int) (maleExtra / 230);
					
					JOptionPane.showMessageDialog(null, "To maintain your weight without exercise you will need"
							 + "\nto eat this many chocolate bars:"
							 + "\n" + mChoc);
					
				}else if(active == 2){ 
					maleBMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
					maleExtra = maleBMR + (maleBMR * 0.3);
					mChoc = (int) (maleExtra / 230);

					JOptionPane.showMessageDialog(null, "To maintain your weight without exercise you will need"
							 + "\nto eat this many chocolate bars:"
							 + "\n" + mChoc);
				
				}else if(active == 3){ 
					maleBMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
					maleExtra = maleBMR + (maleBMR * 0.4);
					mChoc = (int) (maleExtra / 230);
					

					JOptionPane.showMessageDialog(null, "To maintain your weight without exercise you will need"
							 + "\nto eat this many chocolate bars:"
							 + "\n" + mChoc);
				
				}else if(active == 4){ 
					maleBMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
					maleExtra = maleBMR + (maleBMR * 0.5);
					mChoc = (int) (maleExtra / 230);

					JOptionPane.showMessageDialog(null, "To maintain your weight without exercise you will need"
							 + "\nto eat this many chocolate bars:"
							 + "\n" + mChoc);
				
				}
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