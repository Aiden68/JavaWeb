package com.Aiden.service.impl;

import java.util.List;

import com.Aiden.dao.IEmployeeDao;
import com.Aiden.entity.Employee;
import com.Aiden.service.IEmployeeService;

public class EmployeeService implements IEmployeeService {

	private IEmployeeDao employeeDao;
	public void setEmployeeDao(IEmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.save(employee);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		employeeDao.delete(id);
	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.update(employee);
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return employeeDao.findById(id);
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return employeeDao.getAll();
	}

	@Override
	public List<Employee> getAll(String employeeName) {
		// TODO Auto-generated method stub
		return employeeDao.getAll(employeeName);
	}

}
