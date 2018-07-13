package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Student;
import com.briup.app02.dao.StudentMapper;
import com.briup.app02.service.IStudentService;
@Service
public class StudentServiceImpl implements IStudentService{
	//自动注入
	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public List<Student> findAll() throws Exception {
		//调用studentMapper查询所有学生
		List<Student> list = studentMapper.findAll();
		return list;
	}

	@Override
	public Student findById(long id) throws Exception {
		Student student = studentMapper.findById(id);
		if(student==null)
			throw new Exception("该学生不存在！");
		else
			return student;
	}

	@Override
	public void insertStudent(Student student) throws Exception {
		if(student==null)
			throw new Exception("id错误！");
		else
		studentMapper.insertStudent(student);
	}

	@Override
	public void deleteStudent(long id) throws Exception {
		Student student = studentMapper.findById(id);
		if(student==null)
			throw new Exception("要删除的学生不存在！");
		else 
			studentMapper.deleteStudent(id);	
	}
	
	@Override
	public void updateStudent(Student student) throws Exception{
		if(student==null)
			throw new Exception("要更新的学生id有误！");
		else 
		studentMapper.updateStudent(student);
	}
	
}
