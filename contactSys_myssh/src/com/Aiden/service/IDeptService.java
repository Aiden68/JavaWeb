package com.Aiden.service;

import java.util.List;

import com.Aiden.entity.Dept;

public interface IDeptService {

	List<Dept> getAll();
	Dept findById(int id);
	
}
