package com.aiden.helloMybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.aiden.helloMybatis.entity.Student;
import com.aiden.helloMybatis.util.*;

/**
 * 
 * @author AdminTC
 */
public class StudentDao {
	/**
	 * 添加
	 */
	public void add(Student student) throws Exception{
		SqlSession sqlSession = null;
		try{
			sqlSession = MybatisUtil.getSqlSession();
			sqlSession.insert(Student.class.getName()+".add",student);
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			sqlSession.rollback();
			throw e;
		}finally{
			MybatisUtil.closeSqlSession();
		}
	}
	
	/**
	 * 根据ID查询学生 
	 */
	public Student findById(int id) throws Exception{
		SqlSession sqlSession = null;
		try{
			sqlSession = MybatisUtil.getSqlSession();
			Student student = sqlSession.selectOne(Student.class.getName()+".findById",id);
			sqlSession.commit();
			return student;
		}catch(Exception e){
			e.printStackTrace();
			sqlSession.rollback();
			throw e;
		}finally{
			MybatisUtil.closeSqlSession();
		}
	}
	/**
	 * 查询所有学生 
	 */
	public List<Student> findAll() throws Exception{
		SqlSession sqlSession = null;
		try{
			sqlSession = MybatisUtil.getSqlSession();
			return sqlSession.selectList(Student.class.getName()+".findAll");
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}finally{
			MybatisUtil.closeSqlSession();
		}
	}
	/**
	 * 更新学生 
	 */
	public void update(Student student) throws Exception{
		SqlSession sqlSession = null;
		try{
			sqlSession = MybatisUtil.getSqlSession();
			sqlSession.update(Student.class.getName()+".update",student);
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			sqlSession.rollback();
			throw e;
		}finally{
			MybatisUtil.closeSqlSession();
		}
	}
	/**
	 * 删除学生 
	 */
	public void delete(Student student) throws Exception{
		SqlSession sqlSession = null;
		try{
			sqlSession = MybatisUtil.getSqlSession();
			sqlSession.delete(Student.class.getName()+".delete",student);
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			sqlSession.rollback();
			throw e;
		}finally{
			MybatisUtil.closeSqlSession();
		}
	}
	
	
	
	
	
	
	
	
	
	/*
	 * 测试
	 */
	
	public static void main(String[] args) throws Exception{
		StudentDao dao = new StudentDao();
		Student student = dao.findById(2);
		System.out.println(student.getName());
		dao.delete(student);
		List<Student> list = dao.findAll();
		for(Student s : list){
			System.out.println(s.getName());
		}
		
	}
}




