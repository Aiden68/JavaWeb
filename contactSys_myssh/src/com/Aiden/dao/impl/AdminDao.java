package com.Aiden.dao.impl;

import org.hibernate.SessionFactory;
import org.junit.Test;

import com.Aiden.dao.IAdminDao;
import com.Aiden.entity.Admin;

public class AdminDao implements IAdminDao{

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Test
	public void test(){
		save(new Admin());
	}
	
	@Override
	public void save(Admin admin) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(admin);
	}

	@Override
	public Admin findByAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return (Admin)sessionFactory.getCurrentSession()
				.createQuery("from Admin where adminName = ? and pwd = ?")
				.setString(0, admin.getAdminName())
				.setString(1, admin.getPwd())
				.uniqueResult();
	}


}
