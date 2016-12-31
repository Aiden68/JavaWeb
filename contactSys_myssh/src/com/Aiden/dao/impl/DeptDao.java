package com.Aiden.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.Aiden.dao.IAdminDao;
import com.Aiden.dao.IDeptDao;
import com.Aiden.entity.Admin;
import com.Aiden.entity.Dept;

public class DeptDao implements IDeptDao{

	private SessionFactory sessionFactory;
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	public List<Dept> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Dept").list();
	}


	@Override
	public Dept findById(int id) {
		// TODO Auto-generated method stub
		return (Dept)sessionFactory.getCurrentSession().get(Dept.class, id);
	}
	
	


}
