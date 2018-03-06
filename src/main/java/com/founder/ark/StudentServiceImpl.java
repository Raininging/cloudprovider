package com.founder.ark;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.stereotype.Service;

import com.founder.ark.common.jdbc.service.BasicService;

@Service
public class StudentServiceImpl extends BasicService implements StudentService{

	@Override
	public List<Student> find() {
		String sql = "select * from student";
		List<Student> students = dao.query(sql, new BeanPropertyRowMapper<>(Student.class));
		return students;
	}


	@Override
	public void update(Student student) {
		String sql = "update student set name=:name,sex=:sex where id=:id";
		dao.update(sql, new BeanPropertySqlParameterSource(student));
	}

	@Override
	public void delete(Student student) {
		String sql = "delete from student where id=:id";
		dao.update(sql, new BeanPropertySqlParameterSource(student));
	}

	@Override
	public void add(Student student) {
		String sql = "insert into student(id,name,sex,age) values(:id,:name,:sex,:age)";
		dao.update(sql, new BeanPropertySqlParameterSource(student));
	}

}
