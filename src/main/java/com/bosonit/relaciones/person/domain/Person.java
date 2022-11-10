package com.bosonit.relaciones.person.domain;

import com.bosonit.relaciones.professor.domain.Professor;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Data
@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long person_id;

    private String name;

    private String lastName;

    private Date birthDate;

    @OneToOne(mappedBy="person")
    @JsonIgnore
    private Professor professor;

    @OneToOne(mappedBy="person")
    @JsonIgnore
    private Professor student;


}
