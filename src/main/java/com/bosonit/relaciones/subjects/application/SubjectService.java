package com.bosonit.relaciones.subjects.application;

import com.bosonit.relaciones.student.infraestructure.repository.StudentRepository;
import com.bosonit.relaciones.subjects.domain.Subject;
import com.bosonit.relaciones.subjects.infraestructure.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {
    @Autowired
    SubjectRepository subjectRepository;

    @Autowired
    StudentRepository studentRepository;

    public Subject addSubject(Subject subjectAdded){
        return subjectRepository.save(subjectAdded);
    }

    //shd have the same id the person we want to update.
    public Subject updateSubject(Subject subjectUpdated){
        return subjectRepository.save(subjectUpdated);
    }

    public Optional<Subject> findById(Long subjectId){
        return subjectRepository.findById(subjectId);
    }

    public List<Subject> findAll(){
        return subjectRepository.findAll();
    }


}
