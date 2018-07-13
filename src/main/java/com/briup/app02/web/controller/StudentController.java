package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Student;
import com.briup.app02.service.IStudentService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/student")			//根路由、路由的命名空间为Student
public class StudentController {

	//注入StudentService的实例
	@Autowired
	private IStudentService studentService;
	
	//http://127.0.01:8080/student/findAllStudent
	@GetMapping("findAllStudent")
	public List<Student> findAllStudent(){
		
		try {
			List<Student> list = studentService.findAll();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}		
	}
	
	@GetMapping("findStudentById")
	public MsgResponse findStudentById(long id){
		try {
			Student student =studentService.findById(id);
			return MsgResponse.success("查找成功！",student);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
		/*
		 * 保存学生信息
		 * @author Genius淼
		 * @param student(参数)
		 * @return String
		 * */
	@PostMapping("insertStudent")
	public MsgResponse insertStudent(Student student){
		try {
			studentService.insertStudent(student);
			return MsgResponse.success( "插入成功！", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
		
	@PostMapping("deleteStudent")
	public MsgResponse deleteStudent(long id){
		try {
			studentService.deleteStudent(id);
			return MsgResponse.success("删除成功！",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("updateStudent")
	public MsgResponse updateStudent(Student student){
		try {		
				studentService.updateStudent(student);
				return MsgResponse.success("更新数据成功！", null);
			}	
		 catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
}
