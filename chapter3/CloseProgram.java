package chapter3;

/*
	This is a simple yes/no option to close a program.
	Author: Josias JJ Oberholster
	Chapter 3 From 3.4.
	Last Changed: 12 April 2017
 */

import javax.swing.JOptionPane;

public class CloseProgram extends JOptionPane{

	public static void main(String[] args){
		
		Option();
	}
	
	public static void Option(){
		
		int answer = JOptionPane.showConfirmDialog(null, "End program?", "Click Yes or No", JOptionPane.YES_NO_OPTION);
		
		if(answer == JOptionPane.YES_OPTION){
			System.exit(0);
		}else if(answer == JOptionPane.NO_OPTION){
			Option();
		}else{
			Option();
		}
		
		System.exit(0);
	}
}
