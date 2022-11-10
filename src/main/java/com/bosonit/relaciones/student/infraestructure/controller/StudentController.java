package com.bosonit.relaciones.student.infraestructure.controller;
import com.bosonit.relaciones.student.application.StudentService;
import com.bosonit.relaciones.student.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping
    public Student addStudent(@RequestBody Student newStudent){
        return studentService.addStudent(newStudent);
    }

    @GetMapping("/{student_id}")
    public Optional<Student> findById(@PathVariable Long student_id){
        return studentService.findById(student_id);
    }

    @GetMapping
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @PutMapping
    public Student updatePerson(@RequestBody Student studentUpdated){
        return studentService.updateProfessor(studentUpdated);
    }

    @GetMapping("/student/{student_id}/subject/{subject_id}")
    public Optional<Student> setSubject(@PathVariable Long student_id, @PathVariable Long subject_id){
        return studentService.assignSubject(student_id,subject_id);
    }
}
