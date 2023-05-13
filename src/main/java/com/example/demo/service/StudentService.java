package com.example.demo.service;
import java.util.*;
import com.example.demo.model.Student;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student updateStudent(Student student,Long id);

   public void deleteStudent(Long id);
   public  Student getStudentById(Long id);

}
