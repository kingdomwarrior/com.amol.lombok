package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Employee;
import com.example.demo.repository.EmpRepository;

@RestController
public class EmployeeController {
	
	
	@Autowired
	private EmpRepository emprepo;

	
	@PostMapping("/emp/save")
	public String saveEmpData(@RequestBody Employee emp) {
		
		emprepo.save(emp);
		return "employee saved";
		
	}
}
