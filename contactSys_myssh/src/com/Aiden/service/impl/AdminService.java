package com.Aiden.service.impl;

import com.Aiden.dao.IAdminDao;
import com.Aiden.dao.impl.AdminDao;
import com.Aiden.entity.Admin;
import com.Aiden.service.IAdminService;

public class AdminService implements IAdminService {

	private IAdminDao adminDao;

	public IAdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(IAdminDao adminDao) {
		this.adminDao = adminDao;
	}
	
	@Override
	public void register(Admin admin) {
		// TODO Auto-generated method stub
		adminDao.save(admin);
	}

	@Override
	public Admin login(Admin admin) {
		// TODO Auto-generated method stub
		return adminDao.findByAdmin(admin);
	}

}
