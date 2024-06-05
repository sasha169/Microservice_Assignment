package com.assignment.student_service.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.assignment.student_service.entity.Student;
import com.assignment.student_service.repository.StudentRepository;
import com.assignment.student_service.service.StudentService;

@Service
public class StudentServceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student saveStudentDetails(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public int getStudentDetails(Integer id) {
		Student student = studentRepository.findById(id).get();
		return student.getFee();
	}

}
