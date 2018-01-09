package chapter1;

import javax.swing.JApplet;
import java.awt.Graphics;

public class CrescentMoon extends JApplet {
	
	public void paint(Graphics g){
		
		g.drawArc(50, 50, 200, 200, 90, 180);
		g.drawArc(100, 50, 100, 200, 90, 180);
	}
}
