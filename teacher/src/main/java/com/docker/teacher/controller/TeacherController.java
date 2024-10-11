package com.docker.teacher.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.teacher.Teacher;

@RestController
@RequestMapping("/school/teachers")
public class TeacherController {
	
	@GetMapping
	public ResponseEntity<List<Teacher>> getAllTeacher() {
		List<Teacher> allTeacher = new ArrayList<Teacher>();
		allTeacher.add(new Teacher(1,"Teacher 1"));
		allTeacher.add(new Teacher(2, "Teacher 2"));
		
		return new ResponseEntity<List<Teacher>>(allTeacher, HttpStatus.ACCEPTED);
	}

}
