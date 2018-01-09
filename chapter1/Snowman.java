package chapter1;

import javax.swing.JApplet;
import java.awt.Graphics;

public class Snowman extends JApplet {
	
	public void paint(Graphics g){
		
		//Head of snowman
		g.drawOval(100, 100, 100, 100);
		g.fillOval(120, 130, 20, 20);
		g.fillOval(160, 130, 20, 20);
		g.drawArc(120, 140, 60, 50, 0, -180);
		g.drawArc(120, 150, 60, 25, 0, -180);
		
		//Body of snowman
		g.drawOval(75, 200, 150,150);
		g.drawOval(50, 350, 200, 200);
	}
}
