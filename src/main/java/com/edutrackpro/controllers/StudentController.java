package com.edutrackpro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edutrackpro.api.StudentDTO;
import com.edutrackpro.api.Students;
import com.edutrackpro.dao.StudentDAO;

@Controller
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentDAO studentDAO;
	
	@GetMapping("/show")
	public String fetchAllStudents(Model model) {
		
		List<Students> students = studentDAO.loadStudents();
		
		model.addAttribute("students",students);
		
		return "student-list";
	}
	
	@GetMapping("/add")
	public String addStudent(Model model) {
		
		model.addAttribute("addStudent", new StudentDTO());
		
		return "add-student";
	}
	
	@GetMapping("/submit")
	public String submitNewStudent(@ModelAttribute("addStudent") StudentDTO student) {
		
		studentDAO.insertNewStudent(student.getName(), student.getPhone(), student.getAddress());
		
		return "student-list";
	}
	
	@ResponseBody
	@GetMapping("/showAPI")
	public List<Students> studentsAPIList(Model model) {
		
		List<Students> students = studentDAO.loadStudents();
		
		return students;
	}
}
