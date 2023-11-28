package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    @Autowired

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        studentRepository.findStudentEmail(student.getEmail());
        System.out.println(student);
    }

    public void deleteStudent(Long id) {
        boolean exists=studentRepository.existsById(id);
        if(!exists){
            throw  new IllegalMonitorStateException("not exists");
        }
        studentRepository.deleteById(id);
    }
}
