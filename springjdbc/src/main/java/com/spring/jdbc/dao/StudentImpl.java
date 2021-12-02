package com.spring.jdbc.dao;

import javax.swing.tree.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;
@Component("studentjdbc")
public class StudentImpl implements StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return this.jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
		String query="insert into student(id,name,city) values(?,?,?)";
		int i = jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return i;
	}

	@Override
	public int update(Student student) {
		String query="update student set name=? ,city=? where id=?";
		int i = jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return i;
	}

	@Override
	public Student getStudent(int id) {
		String query="select * from student where id=?";
		org.springframework.jdbc.core.RowMapper<Student> rowMapper=new RowMapperImpl();
		Student student=jdbcTemplate.queryForObject(query, rowMapper,id);
		return student;
	}

}
