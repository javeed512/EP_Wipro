package jdbc.crud;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStmtDemo {

	public static void main(String[] args) throws SQLException {

		Connection conn = DBUtil.getDBConnection();

		CallableStatement cstmt = conn.prepareCall("{call  cust_pro(?,?,?,?) }");

		cstmt.setInt(1, 203);
		cstmt.setString(2, "VIJAY");
		cstmt.setDouble(3, 32000);
		cstmt.registerOutParameter(4, Types.VARCHAR);

		System.out.println("Is Procedure executed ? " + !cstmt.execute());

		String name = cstmt.getString(4);

		System.out.println("welcome  " + name);

	}

}
