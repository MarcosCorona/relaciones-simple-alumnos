package com.bosonit.relaciones.professor.domain;

import com.bosonit.relaciones.person.domain.Person;
import com.bosonit.relaciones.student.domain.Student;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Data
@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long professor_id;

    private String name;

    private String lastName;

    @OneToOne
    @JoinColumn(name="person_id")
    private Person person;

    @OneToMany(mappedBy = "professor")
    @JsonIgnore
    private List<Student> student;


}
