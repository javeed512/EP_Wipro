package com.wipro.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
	public int updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteEmployee(int eid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee getEmployeeById(int eid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
