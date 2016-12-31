package com.Aiden.service;

import java.util.List;

import com.Aiden.entity.Employee;

public interface IEmployeeService {

	void save(Employee employee);
	void delete(int id);
	void update(Employee employee);
	Employee findById(int id);
	List<Employee> getAll();
	List<Employee> getAll(String employeeName);
	
}
