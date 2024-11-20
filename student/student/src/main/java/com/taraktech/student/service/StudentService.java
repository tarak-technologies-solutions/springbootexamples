package com.taraktech.student.service;
import java.util.List;
import com.taraktech.student.entities.Student;

public interface StudentService {
	List<Student> getStudent(Integer sno);
}
