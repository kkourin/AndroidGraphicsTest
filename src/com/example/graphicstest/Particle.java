package com.example.graphicstest;

abstract public class Particle {

	double x, y, dx, dy, dt, angle;
	int screenLength, screenHeight;
	
	public boolean onscreen() {
		return !(x > screenLength+20 || x < -20 || y > screenHeight+20 || y < -20);
	}
	public void update(double dt){
		x += dx*dt;
		y += dy*dt;
		
	}
	public int getx() {
		return (int)Math.round(x);
	}
	public int gety() {
		return (int)Math.round(y);
	}

}
