package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class CustomMorph extends Polymorph implements MouseMotionListener, MouseListener {
	float angle = 0;
	BufferedImage image;
	CustomMorph(int x, int y) {
		super(x, y);
		try {
			image = ImageIO.read(this.getClass().getResource("download.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(x, y, width, height);
		g.drawImage(image, x, y, width, height, null);
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
	//	x = e.getX();
	//	y = e.getY();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getX() > x && e.getX() < x+width && e.getY() > y && e.getY() < y+height) {
			
			JOptionPane.showMessageDialog(null, "clicked");
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}
