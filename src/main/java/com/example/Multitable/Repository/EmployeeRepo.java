package com.example.Multitable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Multitable.Entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{

	
}
