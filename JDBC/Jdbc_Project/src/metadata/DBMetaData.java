package metadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



import jdbc.crud.DBUtil;

public class DBMetaData {

	public static void main(String[] args) throws SQLException {


		Connection conn =	DBUtil.getDBConnection();
		
				DatabaseMetaData dbmd =		conn.getMetaData();
				
			
				
				System.out.println("Driver Name: "+dbmd.getDriverName());  
				System.out.println("Driver Version: "+dbmd.getDriverVersion());  
				System.out.println("UserName: "+dbmd.getUserName());  
				System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
				System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  

				String selectQuery = "select * from customer";

				Statement stmt =		conn.createStatement();
				
				ResultSet rs = stmt.executeQuery(selectQuery);
				
				ResultSetMetaData  rsmd = rs.getMetaData();
				
				
				System.out.println("Total columns: "+rsmd.getColumnCount());  
				System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
				System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));  
				  
				System.out.println("Cname col-2 size "+rsmd.getColumnDisplaySize(2));
				
				
		
	}

}
