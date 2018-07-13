package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Course;

public interface CourseMapper {
	List<Course> selectAll();
	
	Course selectById(long id);
	
    void insertCourse(Course course);
	
    void deleteCourse(long id);

    void updateCourse(Course course);
}
