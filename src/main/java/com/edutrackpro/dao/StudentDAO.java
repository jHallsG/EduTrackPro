package com.edutrackpro.dao;

import java.util.List;

import com.edutrackpro.api.Students;

public interface StudentDAO {
	
	List<Students> loadStudents();
	List<Students> searchStudents(String search);
	void insertNewStudent(String name, long phone, String address);

}
