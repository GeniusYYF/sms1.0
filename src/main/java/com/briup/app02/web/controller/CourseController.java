package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Course;
import com.briup.app02.service.ICourseService;

@RestController
@RequestMapping("/course")

public class CourseController {

	@Autowired
	private ICourseService courseService;
	
	@GetMapping("selectAllCourse")
	public List<Course> selectAllCourse(){
		try {
			List<Course> list = courseService.selectAll();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
		
	@GetMapping("selectCourseById")
	public Course selectCourseById(long id){
		try {
			Course course = courseService.selectById(id);
			return course;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/*
	 * 保存学生信息
	 * @author Genius淼
	 * @param student(参数)
	 * @return String
	 * */
	@PostMapping("insertCourse")
	public String insertCourse(Course course){
		try {
			courseService.insertCourse(course);
			return "插入成功！";
		} catch (Exception e) {
			e.printStackTrace();
			return "插入失败！"+"\n"+e.getMessage();
		}
	}
		
	@PostMapping("deleteCourse")
	public String deleteCourse(long id){
		try {
			courseService.deleteCourse(id);
			return "删除成功！";
		} catch (Exception e) {
			e.printStackTrace();
			return "删除失败！"+"\n"+e.getMessage();
		}
	}
	
	@PostMapping("updateCourse")
	public String updateCourse(Course course){
		try {
			courseService.updateCourse(course);
			return "数据已更新！";
		} catch (Exception e) {
			e.printStackTrace();
			return "数据更新失败！"+"\n"+e.getMessage();
		}
	}
}

