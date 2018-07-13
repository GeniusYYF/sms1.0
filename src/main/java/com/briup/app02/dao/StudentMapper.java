package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Student;

public interface StudentMapper {
	List<Student> findAll();
	
	Student findById(long id);
	
	void insertStudent(Student student);
	
	void deleteStudent(long id);

	void updateStudent(Student student);
	
}
