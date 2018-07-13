package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Course;

public interface ICourseService {
	List<Course> selectAll() throws Exception;
	
	Course selectById(long id) throws Exception;
	
	void insertCourse(Course course) throws Exception;
	
	void deleteCourse(long id) throws Exception;
	
	void updateCourse(Course course) throws Exception;
	
	
}
