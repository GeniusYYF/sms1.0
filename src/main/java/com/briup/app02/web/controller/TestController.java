package com.briup.app02.web.controller;

import javax.swing.JOptionPane;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * 路由的命名空间
 * http://127.0.0.1:8080可以访问到当前项目
 * http://127.0.0.1:8080/test可以访问到当前项目TestController这个类
 * 		hello方法执行完毕后会返回一个字符串，这个
 * */

@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping("hello")
	public String hello(){
		String nStr=JOptionPane.showInputDialog("小曾和俊儿都是垃圾");
		return nStr;
	}
	@GetMapping("langer")
	public String langer(){
		//System.out.println("小曾和俊儿都是垃圾");
		return "小曾和俊儿都是垃圾";
	}
}
  

