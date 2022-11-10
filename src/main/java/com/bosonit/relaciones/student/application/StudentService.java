package com.bosonit.relaciones.student.application;

import com.bosonit.relaciones.student.domain.Student;
import com.bosonit.relaciones.student.infraestructure.repository.StudentRepository;
import com.bosonit.relaciones.subjects.domain.Subject;
import com.bosonit.relaciones.subjects.infraestructure.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    SubjectRepository subjectRepository;

    public Student addStudent(Student studentAdded){
        return studentRepository.save(studentAdded);
    }

    //shd have the same id the person we want to update.
    public Student updateProfessor(Student studentUpdated){
        return studentRepository.save(studentUpdated);
    }

    public Optional<Student> findById(Long studentId){
        return studentRepository.findById(studentId);
    }

    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    public Optional<Student> assignSubject(Long student_id,Long subject_id){
        Optional<Student> student = studentRepository.findById(student_id);
        Optional<Subject> subject = subjectRepository.findById(subject_id);

        if(student.isPresent()){
            student.get().getSubjectList().add(new Subject(subject));
        }
        return student;
    }


}
