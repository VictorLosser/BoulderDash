package mapdao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import mapdao.Map;


public abstract class MapDAO extends AbstractDAO {

    
    private static String sqlExampleById   = "{call findExampleById(?)}";


    
    private static int    idColumnIndex    = 1;

   
    private static int    nameColumnIndex  = 2;

    
    public static Map getMapById(final int id) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlExampleById);
        Map map = null;
        callStatement.setInt(1, id);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                map = new Map(result.getInt(idColumnIndex), result.getString(nameColumnIndex));
            }
            result.close();
        }
        return map;
    }

}
