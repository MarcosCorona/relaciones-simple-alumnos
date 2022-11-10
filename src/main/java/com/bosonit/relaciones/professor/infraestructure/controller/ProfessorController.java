package com.bosonit.relaciones.professor.infraestructure.controller;
import com.bosonit.relaciones.professor.application.ProfessorService;
import com.bosonit.relaciones.professor.domain.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/professor")
public class ProfessorController {
    @Autowired
    ProfessorService professorService;

    @PostMapping
    public Professor addProfessor(@RequestBody Professor newProfessor){
        return professorService.addProfessor(newProfessor);
    }

    @GetMapping("/{professor_id}")
    public Optional<Professor> findById(@PathVariable Long professor_id){
        return professorService.findById(professor_id);
    }

    @GetMapping
    public List<Professor> findAll(){
        return professorService.findAll();
    }

    @PutMapping
    public Professor updatePerson(@RequestBody Professor professorUpdated){
        return professorService.updateProfessor(professorUpdated);
    }

}
