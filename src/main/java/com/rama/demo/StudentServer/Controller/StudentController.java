package com.rama.demo.StudentServer.Controller;



import com.rama.demo.DTO.CreateStudentRequestDTO;
import com.rama.demo.DTO.CreateStudentResponseDTO;
import com.rama.demo.StudentServer.Entity.Student;
import com.rama.demo.StudentServer.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService =studentService;
    }
    @PostMapping("/create")
    public ResponseEntity<?> storeStudent(@RequestBody CreateStudentRequestDTO createStudentRequestDTO){
            CreateStudentResponseDTO result = studentService.studentValidate(createStudentRequestDTO);
            return ResponseEntity.ok(result);
        }



    @GetMapping("/get/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable int id){
        Student student =studentService.getStudentById(id);
        return ResponseEntity.status(200).body(student);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateStudent(@PathVariable int id, @RequestBody Student student) {
        Student updatedStudent = studentService.updateStudent(id);
        return ResponseEntity.status(200).body(updatedStudent);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
        return ResponseEntity.status(200).body("Student deleted successfully");
    }


}
