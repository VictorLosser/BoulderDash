package model;
import java.sql.SQLException;

import java.util.Observable;

import javax.swing.JOptionPane;

import model.dao.ExampleDAO;
import model.Assets;




public class Model extends Observable implements IModel {

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
	
	private Assets					assets;
	
	
	
	
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
		try {
			this.setMessage(this.getExampleById(1).getName());
		} catch (SQLException e) {
			
			e.printStackTrace();
		}JOptionPane.showMessageDialog(null, message);
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
	
	public String getMessage() {
		return this.message;

	}

	public void doTheThing() {
		String[] tabmap = this.message.split("\n") ;
		for(int i =0; i<tabmap.length; i++)
		{
			for (int j =0; j<tabmap[i].length();j++)
			{
				switch (tabmap[i].charAt(j)) {
					case'0':
						this.putInTabmap(i,j,'0');
						break;
					case'*':
						this.putInTabmap(i,j,'*');
						break;
					case'-':
						this.putInTabmap(i,j,'-');
						break;
					case'B':
						this.putInTabmap(i,j,'B');
						break;
					case'i':
						this.putInTabmap(i,j,'i');
						break;
					case' ':
						this.putInTabmap(i,j,' ');
						break;
					case'S':
						this.putInTabmap(i,j,'S');
						break;
					case'F':
						this.putInTabmap(i,j,'F');
						break;
					case'E':
						this.putInTabmap(i,j,'E');
						break;
					case'H':
						this.putInTabmap(i,j,'H');
						setPositionHeroX(j);
						setPositionHeroY(i);
						break;
				}
			}JOptionPane.showMessageDialog(null, message);
		}
		
	}
	
	
	private void setMessage(final String message) {
		this.message = message;
		this.setChanged();
		this.notifyObservers();
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

	@Override
    public Example getExampleById(final int id) throws SQLException {
        return ExampleDAO.getExampleById(id);
    }
	
	public Observable getObservable() {
		return this;
	}


	public Assets getAssets() {
		return assets;
	}


	public void setAssets(Assets assets) {
		this.assets = assets;
	}

}