package chapter1;

import javax.swing.JApplet;
import java.awt.Graphics;

public class Olympics extends JApplet{
	
	public void paint(Graphics g){
		
		//First Oval
		g.drawOval(50, 50, 100, 100);
		
		//Second Oval
		g.drawOval(110, 100, 100, 100);
		
		//Third Oval
		g.drawOval(170, 50, 100, 100);
		
		//Fourth Oval
		g.drawOval(230, 100, 100, 100);
		
		//fifth Oval
		g.drawOval(290,50, 100, 100);
	}

}
