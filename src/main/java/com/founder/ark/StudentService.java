package com.founder.ark;

import java.util.List;

public interface StudentService {
	
	public List<Student> find();
	
	public void update(Student student);
	
	public void delete(Student student);
	
	public void add(Student student);
}
