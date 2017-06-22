package model;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import java.util.Observable;

import javax.swing.JOptionPane;

import controller.IController;
import model.MapToArray;
import model.dao.ExampleDAO;






public class Model extends Observable implements IModel {

		
	private String message;	
	
	private Animation 	animation;
	public int[][] tabmap2d;
	public int[][] tabani2d;
	
	public Model() throws IOException{
		
		MapToArray map1 = new MapToArray("C:/Users/Windows/git/BoulderDash/model/res/maps/map1.txt");
			this.setTabmap2d(map1.getArray());	
			
	}
	
	public int[][] getTabmap2d() {
        return this.tabmap2d;
    }
	
	protected void setTabmap2d(final int[][] tabmap2d ) {
		this.tabmap2d  = tabmap2d ;
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
	
	
	public String getMessage() {
		return this.message;

	}

	public void putInTabani(int x1, int y1, int x2, int y2) {
		this.tabani2d[0][0] = animation.getAnimationHero()+x1;this.tabani2d[0][1] = animation.getAnimationHero()+y1;this.tabani2d[2][0] = animation.getAnimationHero()+x1;
		this.tabani2d[2][1] = animation.getAnimationHero()+y1;this.tabani2d[0][2] = animation.getWidhtSprite();this.tabani2d[0][3] = animation.getHightSprite();this.tabani2d[2][2] = animation.getWidhtSprite();
		this.tabani2d[2][3] = animation.getHightSprite();this.tabani2d[1][0] = animation.getAnimationHero()+x2;this.tabani2d[1][1] = animation.getAnimationHero()+y2;this.tabani2d[3][0] = animation.getAnimationHero()+x2;
		this.tabani2d[3][1] = animation.getAnimationHero()+y2;this.tabani2d[1][2] = animation.getWidhtSprite();this.tabani2d[1][3] = animation.getHightSprite();this.tabani2d[3][2] = animation.getWidhtSprite();this.tabani2d[3][3] = animation.getHightSprite();
	}
			
		
	
	private void setMessage(final String message) {
		this.message = message;
		this.setChanged();
		this.notifyObservers();
	}
	
	public int[][] getTabani2d() {
		return this.tabani2d;
	}

	@Override
    public Example getExampleById(final int id) throws SQLException {
        return ExampleDAO.getExampleById(id);
    }
	
	public Observable getObservable() {
		return this;
	}

}