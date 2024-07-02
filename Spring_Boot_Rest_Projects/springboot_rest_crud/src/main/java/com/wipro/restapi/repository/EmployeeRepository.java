package com.wipro.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wipro.restapi.entities.Employee;

import jakarta.transaction.Transactional;

@Repository
public interface EmployeeRepository  extends  JpaRepository<Employee,Integer> {
	
	// select e from Employee e where  e.ename = ?;
		public  Employee   findByEname(String ename);
		
		// select * from Employee_Info where  salary > ?;	
		
		public List<Employee> findBySalaryGreaterThan(double salary);
		
		
		@Query("select  e  from Employee e where e.salary between ?1 and ?2 ") //JPQL QUERY			
		public List<Employee>  	 getAllEmployeesBySalaryRange(double min,double max);
		
		
		
		@Modifying
		@Query("delete from Employee e where  e.ename = ?1")
		public  void  deleteByEname(String ename);

}
