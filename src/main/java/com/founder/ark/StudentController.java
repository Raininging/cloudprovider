package com.founder.ark;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.founder.ark.DemoMbdApi;
@RestController
public class StudentController implements DemoMbdApi {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="find")
	public List<Student> find(){
		List<Student> students = studentService.find();
		return students;
	}
	
	@RequestMapping(value="update")
	public void update(Student student) {
		studentService.update(student);
	}
	
	@RequestMapping(value="delete")
	public void delete(Student student) {
		studentService.delete(student);
	}
	
	@RequestMapping(value="add")
	public void add(Student student) {
		studentService.add(student);
	}

	@Override
	@RequestMapping(value="/test/hello")
	public String sayHello(String name) {
		return "Hello "+name;
	}
	
	@RequestMapping(value="/test")
	public String test(String name) {
		return "Welcome "+name;
	}
}
