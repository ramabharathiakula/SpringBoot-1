package com.rama.demo.StudentServer;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService =studentService;
    }
    @PostMapping("/create")
    public ResponseEntity<Student> storeStudent(@RequestBody Student student){
//        int id=student.getId();
//        String name=student.getName();
//        int age=student.getAge();
//        String department=student.getDepartment();
//        return "id : "+id+", name : "+name+", age : "+age+", department : "+department;
          Student result=studentService.studentValidate(student);

//          if(result==null){
//              return ResponseEntity.status(400).body(result);
//          }
          return ResponseEntity.status(201).body(student);


    }
}
