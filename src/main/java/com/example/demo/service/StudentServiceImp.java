package com.example.demo.service;
import java.util.*;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp  implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    @Override
    public Student updateStudent(Student student,Long id){
        Student studupdate=studentRepository.findById(id).get();
        studupdate.setName(student.getName());
        studupdate.setAddress(student.getAddress());
        return studentRepository.save(studupdate);
    }
    @Override
    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }

    @Override
    public Student getStudentById(Long id){
        Student studget=studentRepository.findById(id).get();

        return studget;
    }
}
