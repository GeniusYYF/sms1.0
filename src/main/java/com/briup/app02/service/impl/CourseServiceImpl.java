package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Course;
import com.briup.app02.dao.CourseMapper;
import com.briup.app02.service.ICourseService;

@Service
public class CourseServiceImpl implements ICourseService{
	
	@Autowired
	private CourseMapper courseMapper;
	
	@Override
	public List<Course> selectAll() throws Exception {
		List<Course> list = courseMapper.selectAll();
		return list;
	}

	@Override
	public Course selectById(long id) throws Exception {
		
		return courseMapper.selectById(id);
	}
	
	@Override
	public void insertCourse(Course course) throws Exception {
		
		courseMapper.insertCourse(course);
	}

	@Override
	public void deleteCourse(long id) throws Exception {
		
		courseMapper.deleteCourse(id);
	}
	
	@Override
	public void updateCourse(Course course) throws Exception {
		
		courseMapper.updateCourse(course);
	}
	
}
