package jdbc.crud;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {

	Connection conn = DBUtil.getDBConnection();

	public int insert() {

		String insertQuery = "insert into customer values(?,?,?,?)"; // ? positional parameter

		int count = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(insertQuery);

			pstmt.setInt(1, 105);
			pstmt.setString(2, "ravi");
			pstmt.setDate(3, new Date(2001, 1, 1));
			pstmt.setDouble(4, 7000);

			count = pstmt.executeUpdate();

			System.out.println(count + "record affected");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;

	}

	public int update() {

		int count = 0;

		String updateQuery = "update customer set  cname = ? , dob = ? , amount = ? where cid = ? ";

		try {

			PreparedStatement pstmt = conn.prepareStatement(updateQuery);

			pstmt.setString(1, "king khan");
			pstmt.setDate(2, new Date(1990, 06, 19));
			pstmt.setDouble(3, 45000);
			pstmt.setInt(4, 101);

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;
	}

	public int delete() {

		String deleteQuery = "delete from customer where  cid = ?";

		// pstmt.setInt(1,101);

		return 0;
	}

	public Customer selectOne() {

		String selectOne = "select * from customer where  cid = ?";

		Customer customer = null;

		try {
			PreparedStatement pstmt = conn.prepareStatement(selectOne);
			
					pstmt.setInt(1, 101);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				int cid = rs.getInt("cid");
				String cname = rs.getString("cname");
				Date dob = rs.getDate("dob");
				double amount = rs.getDouble("amount");

				// customer = new Customer(cid, cname, dob, amount);
				customer = new Customer();

				customer.setCid(cid);
				customer.setCname(cname);
				customer.setDob(dob);
				customer.setAmount(amount);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return customer;

	}

	public List<Customer> selectAll() {

		List<Customer> list = new ArrayList<Customer>();

		String selectAll = "select * from customer";

		try {
			PreparedStatement pstmt = conn.prepareStatement(selectAll);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				int cid = rs.getInt("cid");
				String cname = rs.getString("cname");
				Date dob = rs.getDate("dob");
				double amount = rs.getDouble("amount");

				Customer customer = new Customer(cid, cname, dob, amount);

				list.add(customer);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;

	}
	
	
	public   void  closeConnection() {
		
		
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	

}
