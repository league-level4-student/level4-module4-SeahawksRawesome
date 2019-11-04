package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
   protected int x;
   protected int y;
   //both 50
   protected int width = 50;
   protected int height = 50;
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
    
    public void setX(int x) {
    	this.x = x;
    }
    public void setY(int y) {
    	this.y = y;
    }
    public void setWidth(int width) {
    	this.width = width;
    }
    public void setHeight(int height) {
    	this.height = height;
    }
    
    public int getX() {
    	return x;
    }
    public int getY() {
    	return y;
    }
    public int getWidth() {
    	return width;
    }
    public int getHeight() {
    	return height;
    }
}
