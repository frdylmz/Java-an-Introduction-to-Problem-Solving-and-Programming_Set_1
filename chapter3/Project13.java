package chapter3;

/*
	This program draws the five non-interlocking rings that
	are the symbol of the Olympics.
	Author: Josias JJ Oberholster.
	CHapter 3 Project 13.
	Last Changed: 20 April 2017.
 */

import javax.swing.JApplet;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Graphics;

public class Project13 extends JApplet{
	
	public void paint(Graphics g){
		
		int startProgram = JOptionPane.showConfirmDialog(null, "This program draws the five non-interlocking rings that"
				+"\nare the symbol of the Olympics.", "Olympic Rings", JOptionPane.YES_NO_OPTION);

		if(startProgram == JOptionPane.YES_OPTION){
			int redQuestion = JOptionPane.showConfirmDialog(null, "Change the color of the center circle from black to red?", 
								"First Question", JOptionPane.YES_NO_OPTION);
			int blueQuestion = JOptionPane.showConfirmDialog(null, "Change the color of the outer circle from black to blue?", 
								"Second Question", JOptionPane.YES_NO_OPTION);
			int greenQuestion = JOptionPane.showConfirmDialog(null, "Change the color of the spines from black to green?", 
								"Last Question", JOptionPane.YES_NO_OPTION);
			
			g.setColor(Color.black);
			g.drawOval(50, 50, 100, 100);
			
			//Second Oval
			g.setColor(Color.black);
			g.drawOval(110, 100, 100, 100);
			
			//Third Oval
			g.setColor(Color.black);
			g.drawOval(170, 50, 100, 100);
			
			//Fourth Oval
			g.setColor(Color.black);
			g.drawOval(230, 100, 100, 100);
			
			//fifth Oval
			g.setColor(Color.black);
			g.drawOval(290,50, 100, 100);
			
			if(redQuestion == JOptionPane.YES_OPTION){
					
					//Second Oval
					g.setColor(Color.red);
					g.fillOval(170, 50, 100, 100);
					stop();
			}
			
			if(blueQuestion == JOptionPane.YES_OPTION){
					
				//First Oval
				g.setColor(Color.blue);
				g.fillOval(50, 50, 100, 100);
					
				//fifth Oval
				g.setColor(Color.red);
				g.fillOval(290,50, 100, 100);	
				stop();
			}
	
			if(greenQuestion == JOptionPane.YES_OPTION){
				
				//Second Oval
				g.setColor(Color.green);
				g.fillOval(110, 100, 100, 100);
				
				//Fourth Oval
				g.fillOval(230, 100, 100, 100);
				stop();
			}
			
		}else if(startProgram == JOptionPane.NO_OPTION){
			stop();
		}else{
			stop();
		}
		System.exit(0);
	}
}
	

	
