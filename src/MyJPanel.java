
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.*;


public class MyJPanel extends JPanel implements MouseMotionListener{
	
	private int centerX;
	private int centerY;
	private Square square = new Square(100);
	
	public MyJPanel(){
		addMouseMotionListener(this);
		centerX = centerY = 0;
	}
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		// You should use fillRect()
		g.fillRect(centerX, centerY, square.getShapeWidth(), square.getShapeWidth());
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		centerX = e.getX();
		centerY = e.getY();
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// No need to implement
	}
}
