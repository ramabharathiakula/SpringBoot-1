package com.rama.demo.StudentServer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;


public interface StudentRepository extends JpaRepository<Student,Integer> {



//    public Student save(Student student){
//        System.out.println("Student information saved");
//        return student;
//    }


}
