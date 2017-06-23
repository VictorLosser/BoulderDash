package entities;

import java.awt.Graphics;
import java.awt.Rectangle;

import view.Handler;

public abstract class Entity {

    protected Handler handler;
    protected float x,y;	//Position
    protected int width, height;	//Size
    protected Rectangle bounds;

    public Entity(Handler handler, float x, float y, int width, int height){
        this.handler = handler;
        this.x = x;		//Position in x
        this.y = y;		//Position in y
        this.width = width;		//Size in width
        this.height = height;	//Size in height

        bounds = new Rectangle(0,0,width,height);
    }

    public abstract void tick();

    public abstract void render(Graphics g); //This method will draw the image of the entity

    
    /*/GETTERS AND SETTERS/*/
    
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


}