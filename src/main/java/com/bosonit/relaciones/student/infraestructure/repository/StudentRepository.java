package com.bosonit.relaciones.student.infraestructure.repository;

import com.bosonit.relaciones.student.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
