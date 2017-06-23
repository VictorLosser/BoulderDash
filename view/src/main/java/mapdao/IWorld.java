package mapdao;

import java.sql.SQLException;

import mapdao.Map;

public interface IWorld {

	
	
	Map getMapById(int id) throws SQLException;
	
	void displayMap(String message);
}
