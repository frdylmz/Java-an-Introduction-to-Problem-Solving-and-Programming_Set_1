package chapter2;

/*
	An application that gives multiple windows for testing purposes.
	Author: Josias JJ Oberholster.
	Chapter 2 listing 2.11.
	Last Changed: 23 March 2017.
 */

import javax.swing.JOptionPane;

public class JOptionPaneDemo extends JOptionPane {
	
	public static void main(String[] args){
		
		String appleString = JOptionPane.showInputDialog("Enter number of apples:");
		int appleCount = Integer.parseInt(appleString);
		
		String orangeString = JOptionPane.showInputDialog("Enter number of oranges:");
		int orangeCount = Integer.parseInt(orangeString);
		
		int totalFruitCount = appleCount + orangeCount;
		
		JOptionPane.showMessageDialog(null, "The total number of fruits: " + totalFruitCount);
		
		System.exit(0);
	}
}
