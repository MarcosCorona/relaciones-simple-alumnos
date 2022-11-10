package com.bosonit.relaciones.professor.infraestructure.repository;

import com.bosonit.relaciones.professor.domain.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
