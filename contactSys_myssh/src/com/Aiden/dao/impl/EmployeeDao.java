package com.Aiden.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.Aiden.dao.IAdminDao;
import com.Aiden.dao.IEmployeeDao;
import com.Aiden.entity.Admin;
import com.Aiden.entity.Employee;

public class EmployeeDao implements IEmployeeDao{

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(employee);
	}


	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().createQuery("delete from Employee where id = ?")
		.setParameter(0, id)
		.executeUpdate();
	}


	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(employee);
	}


	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return (Employee)sessionFactory.getCurrentSession().get(Employee.class, id);
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Employee").list();
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAll(String employeeName) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession()
				.createQuery("from Employee where empName like ?")
				.setParameter(0, "%" + employeeName + "%")
				.list();
	}
	
	


}
