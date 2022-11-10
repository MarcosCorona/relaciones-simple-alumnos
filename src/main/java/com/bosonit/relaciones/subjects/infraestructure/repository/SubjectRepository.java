package com.bosonit.relaciones.subjects.infraestructure.repository;

import com.bosonit.relaciones.subjects.domain.Subject;
import org.springframework.data.jpa.repository.JpaRepository;



public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
