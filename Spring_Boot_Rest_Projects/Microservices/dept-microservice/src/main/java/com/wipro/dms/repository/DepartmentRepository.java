package com.wipro.dms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.dms.entities.Department;

@Repository
public interface DepartmentRepository  extends JpaRepository<Department, Long>{

}
