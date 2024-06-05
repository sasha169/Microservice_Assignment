package com.assignment.student_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.student_service.entity.Student;
import com.assignment.student_service.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {
	@Autowired
	StudentService studentService;

	@PostMapping("/save")
	public ResponseEntity<String> createStudentDetails(@RequestBody Student student) {
		studentService.saveStudentDetails(student);

		ResponseEntity<String> response = new ResponseEntity<>("Success", HttpStatus.CREATED);
		return response;
	}

	@GetMapping("details/{id}")
	public int getDetails(@PathVariable Integer id) {
		return studentService.getStudentDetails(id);
	}

}
