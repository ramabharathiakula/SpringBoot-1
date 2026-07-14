package com.rama.demo.StudentServer;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentServer {
    //1. store the student
    @PostMapping("/create")
    public String storeStudent(){
        return """
                id: 1
                name: Rama
                Department: CSE
                age: 20
                """;
    }

    //2.Read the student with id


    //3.Update the student information



    //4. Delete the student information
}
