package com.rama.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ExceptionResponseDTO {
    private LocalDateTime timestamp;
    private int statusCode;
    private String error;
    private String message;
    private String path;


}
