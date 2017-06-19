package model;

import java.sql.SQLException;
import java.util.List;

import model.dao.ExampleDAO;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class Model implements IModel {

	private int animationHeroX;
	private int animationHeroY;
	private int animationHeroX2;
	private int animationHeroY2;
	private int animationHeroW;
	private int animationHeroH;
	private int widhtsprite = 16;
	private int hightsprite = 16;
	
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
		// TODO Auto-generated method stub
		
	}

	public void moveHero(int x, int y) {
		// TODO Auto-generated method stub
		
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
	

	public int[][] getTabani2d() {
		return this.tabani2d;
	}

  

}
