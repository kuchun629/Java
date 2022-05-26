package overriding;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Drawing extends JFrame {

	public static void main(String[] args) {
		new Drawing(); //creating new instance of "Drawing"
	}
	
	public Drawing() {
		setSize(500, 500);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) { //"Graphics" object
		//super.paint(g); //That not running this line removes the functionality of "paint" method
	
	g.drawRect(50, 50, 100, 25); //draw rectangular
	
	g.setColor(new Color(0, 0, 255));
	g.drawOval(200, 50, 50, 50);
	
	g.setColor(Color.CYAN);
	g.fillRect(50, 200, 100, 25); //fill rectangular
	
	g.drawString("My string", 200, 200);
	
	}
}
