package com.rama.demo.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateStudentRequest {
    String name;
    int age;
    String department;
}
