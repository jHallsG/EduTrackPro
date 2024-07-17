package com.edutrackpro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.edutrackpro.api.Students;
import com.edutrackpro.dao.StudentDAO;
import com.edutrackpro.dao.StudentsDAOImpl;

@Controller
public class StudentController {
	
	@Autowired
	StudentDAO studentDAO;
	
	@GetMapping("/showStudents")
	public String fetchAllStudents(Model model) {
		
		List<Students> students = studentDAO.loadStudents();
		
		model.addAttribute("students",students);
		
		return "student-list";
	}
	
	@GetMapping("/searchStudents/{search}")
	public String searchStudent(@PathVariable("search") String search, Model model) {
		
		List<Students> students = studentDAO.searchStudents(search);
		
		model.addAttribute("students",students);
		
		return "student-list";
	}

}
