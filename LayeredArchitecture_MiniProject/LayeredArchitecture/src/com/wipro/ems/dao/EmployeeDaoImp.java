package com.wipro.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wipro.ems.entity.Employee;

public class EmployeeDaoImp implements IEmployeeDao {

	private Connection conn;

	public EmployeeDaoImp() {

		conn = DBUtil.getDBConnection();

	}

	@Override
	public int addEmployee(Employee emp) throws SQLException {

		String insertQuery = "insert into employees values(?,?,?)";

		PreparedStatement pstmt = conn.prepareStatement(insertQuery);

		pstmt.setInt(1, emp.getEid());
		pstmt.setString(2, emp.getEname());
		pstmt.setDouble(3, emp.getSalary());

		int count = pstmt.executeUpdate();

		return count;
	}

	@Override
	public int updateEmployee(Employee emp) throws SQLException {

		String updateQuery = "update Employees set Ename =? , Salary =? where Eid =?";

		PreparedStatement pstmt = conn.prepareStatement(updateQuery);

		pstmt.setString(1, emp.getEname());
		pstmt.setDouble(2, emp.getSalary());
		pstmt.setInt(3, emp.getEid());

		int count = pstmt.executeUpdate();

		return count;
	}

	@Override
	public int deleteEmployee(int eid) throws SQLException {

		String deleteQuery = "delete from Employees where eid = ?";

		PreparedStatement pstmt = conn.prepareStatement(deleteQuery);

		pstmt.setInt(1, eid);

		int count = pstmt.executeUpdate();

		return count;
	}

	@Override
	public Employee getEmployeeById(int eid) throws SQLException {

		String selectOneQuery = "select * from Employees  where eid  = ?";

		PreparedStatement pstmt = conn.prepareStatement(selectOneQuery);

		pstmt.setInt(1, eid);

		ResultSet rs = pstmt.executeQuery();

		Employee emp = null;

		while (rs.next()) {

			emp = new Employee();
			
			emp.setEid(rs.getInt("eid"));
			emp.setEname(rs.getString("ename"));
			emp.setSalary(rs.getDouble("salary"));

		}

		return emp;
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {

		String selectAllQuery = "select * from Employees";

		List<Employee> list = new ArrayList<Employee>();

		PreparedStatement pstmt = conn.prepareStatement(selectAllQuery);

		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {

			Employee emp = new Employee();

			emp.setEid(rs.getInt("eid"));
			emp.setEname(rs.getString("ename"));
			emp.setSalary(rs.getDouble("salary"));

			list.add(emp);

		}

		return list;
	}

}
