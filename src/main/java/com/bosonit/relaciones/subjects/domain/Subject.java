package com.bosonit.relaciones.subjects.domain;

import com.bosonit.relaciones.student.domain.Student;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long subject_id;
    private String subjectName;

    @ManyToMany(mappedBy = "subjectList")
    @JsonIgnore
    private List<Student> students;

    public Subject(Optional<Subject> subject) {
        setSubject_id(subject.get().getSubject_id());
        setSubjectName(subject.get().subjectName);
    }
}
