package chapter3;

/*
	This program will read a user input of a date,
	and test whether it is a valid date.
	Author: Josias JJ Oberholster.
	Chapter 3 Project 9.
	Last Changed: 19 April 2017.
 */

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Project9 extends JOptionPane{

	public static void main(String[] args){
		
		Project9 test = new Project9();
		
		int startProgram = JOptionPane.showConfirmDialog(null, "This program will read a user input of a date,"
														+ "\nand test whether it is a valid date."
														+ "\n\nProceed?", "Date Tester", JOptionPane.YES_NO_OPTION);
		
		if(startProgram == YES_OPTION){
			String testDate = JOptionPane.showInputDialog("Insert the date to test."
														+ "\n[Insert date in to following format"
														+ "\n[yyyy/mm/dd]]");
			
			boolean date = test.isValidDate(testDate);
			
			if(date == true){
				JOptionPane.showMessageDialog(null, testDate + "\nIs a valid date.");
				System.exit(0);
			}else{
				JOptionPane.showMessageDialog(null, testDate + "\nIs not a valid date");
				System.exit(0);
			}			
		}else if(startProgram == NO_OPTION){
			System.exit(0);
		}else{
			System.out.println("Program was forced closed");
			System.exit(0);
		}
		System.exit(0);
	}
	
	public boolean isValidDate(String inDate){
		
		if(inDate == null){
			return false;
		}
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		
		if(inDate.trim().length() != dateFormat.toPattern().length()){
			return false;
		}
		
		dateFormat.setLenient(false);
		
		try{
			dateFormat.parse(inDate.trim());
		}catch(ParseException pex){
			return false;
		}
		
		return true;
	}
}
