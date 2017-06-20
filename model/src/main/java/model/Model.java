package model;
import java.sql.SQLException;
import java.util.List;

import model.dao.ExampleDAO;

public class Model implements IModel {

	private int animationHeroX;
	private int animationHeroY;
	private int animationHeroX2;
	private int animationHeroY2;
	private int animationHeroW;
	private int animationHeroH;
	private int widhtsprite = 16;
	private int hightsprite = 16;
	
	private int height = 22;
	private int width = 40;
	private String message;
	private int positionheroX;
	private int positionheroY;
	
	
	
	
	public char[][] tabmap2d = new char[this.getHeight()][this.getWidth()];
	
	
	public int getAnimationHeroX() {
		return animationHeroX;
	}

	public void setAnimationHeroX(int animationHeroX) {
		this.animationHeroX = animationHeroX;
	}

	public int getAnimationHeroY() {
		return animationHeroY;
	}

	public void setAnimationHeroY(int animationHeroY) {
		this.animationHeroY = animationHeroY;
	}
	
	public int getAnimationHeroX2() {
		return animationHeroX2;
	}

	public void setAnimationHeroX2(int animationHeroX2) {
		this.animationHeroX2 = animationHeroX2;
	}

	public int getAnimationHeroY2() {
		return animationHeroY2;
	}

	public void setAnimationHeroY2(int animationHeroY2) {
		this.animationHeroY2 = animationHeroY2;
	}

	public int getAnimationHeroW() {
		return animationHeroW;
	}

	public void setAnimationHeroW(int animationHeroW) {
		this.animationHeroW = animationHeroW;
	}

	public int getAnimationHeroH() {
		return animationHeroH;
	}

	public void setAnimationHeroH(int animationHeroH) {
		this.animationHeroH = animationHeroH;
	}
	
	public int getHightSprite() {
		return this.hightsprite;
	}

	
	public int getWidhtSprite() {
		return this.widhtsprite;
	}

	
	
	
	
	public void loadMessage(String key) {
		
	}

	public void moveHero(int x, int y) {
		
	}
	
	public int[][] tabani2d;
	
	public void putInTabani(int x1, int y1, int x2, int y2) {
		this.tabani2d[0][0] = animationHeroX+x1;
		this.tabani2d[0][1] = animationHeroY+y1;
		this.tabani2d[2][0] = animationHeroX+x1;
		this.tabani2d[2][1] = animationHeroY+y1;
		this.tabani2d[0][2] = widhtsprite;
		this.tabani2d[0][3] = hightsprite;
		this.tabani2d[2][2] = widhtsprite;
		this.tabani2d[2][3] = hightsprite;
		this.tabani2d[1][0] = animationHeroX+x2;
		this.tabani2d[1][1] = animationHeroY+y2;
		this.tabani2d[3][0] = animationHeroX+x2;
		this.tabani2d[3][1] = animationHeroY+y2;
		this.tabani2d[1][2] = widhtsprite;
		this.tabani2d[1][3] = hightsprite;
		this.tabani2d[3][2] = widhtsprite;
		this.tabani2d[3][3] = hightsprite;
	}
	
	public void putInTabmap(int i, int j, char car) {
		this.tabmap2d[i][j] = car;
	}

	public void doTheThing() {
		String[] tabmap = this.message.split("\n") ;
		for(int i =0; i<tabmap.length; i++)
		{
			for (int j =0; j<tabmap[i].length();j++)
			{
				switch (tabmap[i].charAt(j)) {
					case'O':
						this.putInTabmap(i,j,'O');
						break;
					case'R':
						this.putInTabmap(i,j,'R');
						break;
					case'S':
						this.putInTabmap(i,j,'S');
						break;
					case'T':
						this.putInTabmap(i,j,'T');
						break;
					case'Q':
						this.putInTabmap(i,j,'Q');
						break;
					case'P':
						this.putInTabmap(i,j,'P');
						break;
					case'N':
						this.putInTabmap(i,j,'N');
						break;
					case'M':
						this.putInTabmap(i,j,'M');
						break;
					case'L':
						this.putInTabmap(i,j,'L');
						break;
					case'K':
						this.putInTabmap(i,j,'K');
						break;
					case'J':
						this.putInTabmap(i,j,'J');
						break;
					case'I':
						this.putInTabmap(i,j,'I');
						break;
					case'U':
						this.putInTabmap(i,j,'U');
						break;
					case'V':
						this.putInTabmap(i,j,'V');
						break;
					case'X':
						this.putInTabmap(i,j,'X');
						break;
					case'Y':
						this.putInTabmap(i,j,'Y');
						break;
					case'Z':
						this.putInTabmap(i,j,'Z');
						break;
					case'A':
						this.putInTabmap(i,j,'A');
						setPositionHeroX(j);
						setPositionHeroY(i);
						break;
				}
			}
		}
		
	}
	
	public int[][] getTabani2d() {
		return this.tabani2d;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public char[][] getTabmap2d() {
        return this.tabmap2d;
    }

	public int getPositionHeroY() {
		return positionheroY;
	}

	public void setPositionHeroY(int positionheroY) {
		this.positionheroY = positionheroY;
	}

	public int getPositionHeroX() {
		return positionheroX;
	}

	public void setPositionHeroX(int positionheroX) {
		this.positionheroX = positionheroX;
	}

}