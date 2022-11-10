package com.bosonit.relaciones.subjects.infraestructure.controller;
import com.bosonit.relaciones.student.domain.Student;
import com.bosonit.relaciones.subjects.application.SubjectService;
import com.bosonit.relaciones.subjects.domain.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/subjects")
public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @PostMapping
    public Subject addSubject(@RequestBody Subject newSubject){
        return subjectService.addSubject(newSubject);
    }

    @GetMapping("/{subject_id}")
    public Optional<Subject> findById(@PathVariable Long subject_id){
        return subjectService.findById(subject_id);
    }

    @GetMapping
    public List<Subject> findAll(){
        return subjectService.findAll();
    }

    @PutMapping
    public Subject updatePerson(@RequestBody Subject studentUpdated){
        return subjectService.updateSubject(studentUpdated);
    }

}
