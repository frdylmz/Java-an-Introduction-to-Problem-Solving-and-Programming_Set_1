package chapter1;

import javax.swing.JApplet;
import java.awt.Graphics;

public class Circles extends JApplet {
	
	public void paint(Graphics g){
		
		g.drawOval(100, 100, 50, 50);
		g.fillOval(110, 110, 30, 30);
		
		g.drawArc(100, 50, 50, 50, 0, -180);
		g.drawArc(100, 150, 50, 50, 0, 180);
		g.drawArc(50, 100, 50, 50, -270, -180);
		g.drawArc(150, 100, 50, 50, 90, 180);
	}
}
