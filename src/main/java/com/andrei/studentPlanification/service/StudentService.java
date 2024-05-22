package com.andrei.studentPlanification.service;

import com.andrei.studentPlanification.dto.StudentDto;
import lombok.AllArgsConstructor;
import com.andrei.studentPlanification.model.Student;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import com.andrei.studentPlanification.mapper.StudentMapper;
import org.springframework.stereotype.Service;
import com.andrei.studentPlanification.repository.StudentRepository;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentService {

    private StudentRepository studentRepository;

    public List<StudentDto> getAllStudents() {
        return studentRepository.findAll()
                .stream()
                .map(StudentMapper.mapper::convertEntityToDto)
                .toList();
    }

    public List<StudentDto> getStudentById(int id) {
        return studentRepository.findById(id)
                .stream()
                .map(StudentMapper.mapper::convertEntityToDto)
                .toList();
    }

    public void modifyStudent(int id, StudentDto newStudentDto){
        Student existingStudent = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Does not exist!"));

        Student newStudent = StudentMapper.mapper.convertDtoToEntity(newStudentDto);
        existingStudent.setName(newStudent.getName());
        existingStudent.setGrade(newStudent.getGrade());
        existingStudent.setYearId(newStudent.getYearId());
        existingStudent.setGroupId(newStudent.getGroupId());
        existingStudent.setSubjectsId(newStudent.getSubjectsId());
        studentRepository.save(existingStudent);
    }

    public String deleteStudentById(int id){
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()){
            studentRepository.deleteById(id);
            return "Deleted";
        } else {
            return "Not Found";
        }
    }

    public void createStudent(StudentDto studentDto){
        Student student=StudentMapper.mapper.convertDtoToEntity(studentDto);
        studentRepository.save(student);
    }

    public void deleteAllUsers() {
        studentRepository.deleteAll();
    }

}