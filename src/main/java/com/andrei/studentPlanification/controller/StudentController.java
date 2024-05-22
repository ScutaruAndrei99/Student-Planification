package com.andrei.studentPlanification.controller;

import com.andrei.studentPlanification.dto.StudentDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.andrei.studentPlanification.service.StudentService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/student")
public class StudentController {

    StudentService studentService;

    @GetMapping()
    public List<StudentDto> getAllStudent() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public List<StudentDto> getUserById(@PathVariable("id") int id) {
        return studentService.getStudentById(id);
    }

    @PostMapping()
    public ResponseEntity<StudentDto> createStudent(@RequestBody StudentDto studentDto) {
        studentService.createStudent(studentDto);
        return new ResponseEntity<>(studentDto, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentDto> updateStudent(@PathVariable("id") int id, @RequestBody StudentDto studentDto) {
        studentService.modifyStudent(id, studentDto);
        return new ResponseEntity<>(studentDto, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudentById(@PathVariable("id") int id){
        String response = studentService.deleteStudentById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteAllUsers() {
        studentService.deleteAllUsers();
        return new ResponseEntity<>("Deleted!", HttpStatus.OK);
    }
    // delete all poate sa dispara
}
