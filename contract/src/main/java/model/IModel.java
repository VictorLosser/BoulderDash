package model;

import java.sql.SQLException;
import java.util.List;


public interface IModel {

	void loadMessage(String key);

	

	void moveHero(int x, int y);
	
	void putInTabani(int x1, int y1, int x2, int y2);

	int[][] getTabani2d();
	
	void doTheThing();
	
	char[][] getTabmap2d();
	
	 Example getExampleById(int id) throws SQLException;
  
}
