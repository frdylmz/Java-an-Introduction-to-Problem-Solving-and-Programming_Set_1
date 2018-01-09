package chapter3;

/*
	This program draws the five non-interlocking rings that
	are the symbol of the Olympics.
	Author: Josias JJ Oberholster.
	CHapter 3 Project 12.
	Last Changed: 20 April 2017.
 */

import javax.swing.JApplet;
import java.awt.Color;
import java.awt.Graphics;

public class Project12 extends JApplet{

	public void paint(Graphics g){
		
		//Blue Ring
		g.setColor(Color.blue);
		g.fillOval(20, 20, 100, 100);
		g.setColor(Color.white);
		g.fillOval(30, 30, 80, 80);
		
		//Black Ring
		g.setColor(Color.black);
		g.fillOval(140, 20, 100, 100);
		g.setColor(Color.white);
		g.fillOval(150, 30, 80, 80);
		
		//Black Ring
		g.setColor(Color.red);
		g.fillOval(260, 20, 100, 100);
		g.setColor(Color.white);
		g.fillOval(270, 30, 80, 80);
		
		//Yellow Ring
		g.setColor(Color.yellow);
		g.fillOval(80, 60, 100, 100);
		g.setColor(Color.white);
		g.fillOval(90, 70, 80, 80);
		
		//Green Ring
		g.setColor(Color.green);
		g.fillOval(200, 60, 100, 100);
		g.setColor(Color.white);
		g.fillOval(210, 70, 80, 80);
	}
}
