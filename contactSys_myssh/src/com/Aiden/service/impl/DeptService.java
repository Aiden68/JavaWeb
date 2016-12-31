package com.Aiden.service.impl;

import java.util.List;

import com.Aiden.dao.IDeptDao;
import com.Aiden.dao.impl.DeptDao;
import com.Aiden.entity.Dept;
import com.Aiden.service.IDeptService;

public class DeptService implements IDeptService {

	private IDeptDao deptDao;

	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}
	@Override
	public List<Dept> getAll() {
		// TODO Auto-generated method stub
		return deptDao.getAll();
	}

	@Override
	public Dept findById(int id) {
		// TODO Auto-generated method stub
		return deptDao.findById(id);
	}

}
