package com.Aiden.dao;

import com.Aiden.entity.Admin;

public interface IAdminDao {
	void save(Admin admin);
	Admin findByAdmin(Admin admin);
}
