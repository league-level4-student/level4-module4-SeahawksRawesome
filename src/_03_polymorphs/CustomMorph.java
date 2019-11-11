package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class CustomMorph extends Polymorph implements MouseMotionListener{
	float angle = 0;
	CustomMorph(int x, int y) {
		super(x, y);
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(x, y, width, height);
		
	}
	
	public void update() {
	//	y += Math.sin(angle) * 3;
	//	x += Math.cos(angle) * 3;	
	//	angle += 0.1;
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX();
		y = e.getY();
	}

	

}
