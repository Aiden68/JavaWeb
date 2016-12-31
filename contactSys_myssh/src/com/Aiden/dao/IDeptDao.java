package com.Aiden.dao;

import java.util.List;

import com.Aiden.entity.Dept;

public interface IDeptDao {
	List<Dept> getAll();
	Dept findById(int id);
}
