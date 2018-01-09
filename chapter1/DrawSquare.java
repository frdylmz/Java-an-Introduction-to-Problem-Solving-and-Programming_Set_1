package chapter1;

import javax.swing.JApplet;
import java.awt.Graphics;

public class DrawSquare extends JApplet{
	
	public void paint(Graphics g){
		
		g.drawRect(100, 100, 200, 200);
		g.drawOval(100, 100, 200, 200);
		g.drawOval(0, 0, 200, 200);
		g.drawOval(200, 200, 200, 200);
		g.drawOval(200, 0, 200, 200);
		g.drawOval(0, 200, 200, 200);
	}

}
