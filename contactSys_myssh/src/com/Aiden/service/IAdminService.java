package com.Aiden.service;

import com.Aiden.entity.Admin;

public interface IAdminService {
	
	void register(Admin admin);
	
	Admin login(Admin admin);
}
