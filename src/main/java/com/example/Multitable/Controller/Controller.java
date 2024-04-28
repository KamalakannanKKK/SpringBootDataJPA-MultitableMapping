package com.example.Multitable.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Multitable.Entity.Employee;
import com.example.Multitable.Service.EmployeeService;

@RestController
public class Controller {
   
	@Autowired
	EmployeeService empservice;
	
	@PostMapping("/addEmployee")
	public Employee AddEmployee(@RequestBody Employee employee) {
		return this.empservice.createEmployee(employee);
	}
	
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee(){
		return this.empservice.getAllEmployee();
	}
	
	@GetMapping("/get/{id}")
	public Employee getEmployeebyId(@PathVariable long id) {
		return this.empservice.getEmployee(id);
	}
	

	
}
