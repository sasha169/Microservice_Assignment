package com.assignment.student_service.service;

import com.assignment.student_service.entity.Student;

public interface StudentService {
	public Student saveStudentDetails(Student student);

	public int getStudentDetails(Integer id);

}
