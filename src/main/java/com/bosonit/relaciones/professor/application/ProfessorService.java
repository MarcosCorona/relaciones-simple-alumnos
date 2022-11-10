package com.bosonit.relaciones.professor.application;

import com.bosonit.relaciones.person.infraestructure.repository.PersonRepository;
import com.bosonit.relaciones.professor.domain.Professor;
import com.bosonit.relaciones.professor.infraestructure.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProfessorService {
    @Autowired
    ProfessorRepository professorRepository;

    public Professor addProfessor(Professor professorAdded){
        return professorRepository.save(professorAdded);
    }

    //shd have the same id the person we want to update.
    public Professor updateProfessor(Professor professorUpdated){
        return professorRepository.save(professorUpdated);
    }

    public Optional<Professor> findById(Long professorId){
        return professorRepository.findById(professorId);
    }

    public List<Professor> findAll(){
        return professorRepository.findAll();
    }


}
