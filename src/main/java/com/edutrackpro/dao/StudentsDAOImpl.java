package com.edutrackpro.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.edutrackpro.api.Students;

@Repository
public class StudentsDAOImpl implements StudentDAO{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Students> loadStudents() {
		List<Students> loadStudents = jdbcTemplate.query("SELECT * FROM Students", new BeanPropertyRowMapper<>(Students.class));
		return loadStudents;
	}
	
	public List<Students> searchStudents(String search){
		String searchPattern = "%" + search + "%";
		List<Students> searchStudents = jdbcTemplate.query("SELECT * FROM Students WHERE name LIKE ? OR address LIKE ?", new BeanPropertyRowMapper<>(Students.class), searchPattern, searchPattern);
		return searchStudents;
	}

}
