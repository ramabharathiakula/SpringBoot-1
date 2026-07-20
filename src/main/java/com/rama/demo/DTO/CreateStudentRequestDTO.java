package com.rama.demo.DTO;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
@Setter
@Getter
public class CreateStudentRequestDTO {


    String name;
    int age;
    String department;

}
