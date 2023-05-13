package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New Student is Added";
    }
    //read operation
    @GetMapping("/getAll")
    public List<Student>getAllStudents(){
        return studentService.getAllStudents();
    }
    @PutMapping("put/{id}")
    public String updateStudent(@RequestBody Student student,
                                 @PathVariable("id") Long id){
        studentService.updateStudent(student,id);
        return "Student detalis is Updated";
    }
    @DeleteMapping("delete/{id}")
    public String deleteStudent(@PathVariable("id") Long id){
        studentService.deleteStudent(id);
        return "deleted Successful";
    }
    @GetMapping("get/{id}")
    public Student getStudentById(@PathVariable("id") Long id){
        return studentService.getStudentById(id);

    }

}
