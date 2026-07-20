package com.rama.demo.StudentServer.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rama.demo.StudentServer.Repository.StudentRepository;
import com.rama.demo.StudentServer.Entity.Student;
import com.rama.demo.DTO.CreateStudentRequestDTO;
import com.rama.demo.DTO.CreateStudentResponseDTO;

import java.time.LocalDateTime;

@Service
public class StudentService {
    StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public CreateStudentResponseDTO studentValidate(CreateStudentRequestDTO createstudentRequestDTO) {


//        int id = student.getId();
//        String name = student.getName();
//        String dept = student.getDept();
//        int age = student.getAge();
//
//        if(id<0 || name==null || age<0 || dept==null){
//            return null;
//        }

//       studentRepository.save(student);
//
//
//        return "Data Saved";
        Student student = mapToStudent(createstudentRequestDTO);
        return mapToResponseDTO(student);
    }


    public Student getStudentById(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student updateStudent(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student deleteStudent(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    private Student mapToStudent(CreateStudentRequestDTO createStudentRequestDTO) {
        Student student = new Student();

        student.setName(createStudentRequestDTO.getName());
        student.setAge(createStudentRequestDTO.getAge());
        student.setDepartment(createStudentRequestDTO.getDepartment());

        return student;
    }

    public CreateStudentResponseDTO mapToResponseDTO(Student student) {
        CreateStudentResponseDTO createStudentResponseDTO = new CreateStudentResponseDTO();
        createStudentResponseDTO.setId(student.getId());
        createStudentResponseDTO.setName(student.getName());
        createStudentResponseDTO.setAge(student.getAge());
        createStudentResponseDTO.setDepartment(student.getDepartment());

        return createStudentResponseDTO;
    }
}