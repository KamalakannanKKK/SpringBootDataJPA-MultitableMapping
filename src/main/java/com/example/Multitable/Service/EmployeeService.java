package com.example.Multitable.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Multitable.Entity.Address;
import com.example.Multitable.Entity.Employee;
import com.example.Multitable.Repository.AddressRepo;
import com.example.Multitable.Repository.EmployeeRepo;
import com.example.Multitable.Repository.projectRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;
	
	@Autowired
	AddressRepo addressRepo;
	
	@Autowired
	projectRepo projectRepo;
	
	public Employee createEmployee(Employee emp) {
		return this.employeeRepo.save(emp);
	}
	
	public List<Employee> getAllEmployee() {
		return this.employeeRepo.findAll();
	}
	
    public Employee getEmployee(long id) {
    	return this.employeeRepo.findById(id).get();
    }
}
