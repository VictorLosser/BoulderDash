package model;

public class Object {
	
	private int lenght, height;
	private int x, y;
	
	
	public Object(int x, int y, int lenght, int height){
		this.x = x;
		this.y = y;
		this.lenght = lenght;
		this.height = height;
	}

	//getters and setters//
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	
	
}
