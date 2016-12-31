package com.Aiden.action;


import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.junit.Test;
import org.junit.runner.Request;

import com.Aiden.entity.Dept;
import com.Aiden.entity.Employee;
import com.Aiden.service.IDeptService;
import com.Aiden.service.IEmployeeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport implements RequestAware{
//获取数据，也可以使用模型驱动
	private String name;
	private double salary;
	private int deptId;
	private int id;
	
	Employee employee = new Employee();
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	private IEmployeeService employeeService;
	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	private IDeptService deptService;
	public void setDeptService(IDeptService deptService) {
		this.deptService = deptService;
	}

	public String list(){
		List<Employee> listEmp = employeeService.getAll();
		//保存到request
		request.put("listEmp", listEmp);
		return "list";
	}
	
	public String viewAddEmp(){
		List<Dept> listDept = deptService.getAll();
		request.put("listDept", listDept);
		return "viewAddEmp";
	}
	
	public String save(){
		employee.setDeptId(deptId);
		employee.setName(name);
		employee.setSalary(salary);
		employeeService.save(employee);
		return list();
	}
	
	public String delete(){
		employeeService.delete(id);
		return list();
	}
	
	public String viewUpdate(){
		List<Employee> listEmp = employeeService.getAll();
		request.put("listEmp", listEmp);
		List<Dept> listDept = deptService.getAll();
		request.put("listDept", listDept);
		employee = employeeService.findById(id);
		request.put("employee", employee);
		return "edit";
	}
	
	public String update(){
		employee.setDeptId(deptId);
		employee.setName(name);
		employee.setSalary(salary);
		employeeService.update(employee);
		return list();
	}

	private Map<String, Object> request;
	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.request = request;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}
