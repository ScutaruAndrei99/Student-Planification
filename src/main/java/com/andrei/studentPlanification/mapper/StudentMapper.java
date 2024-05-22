package com.andrei.studentPlanification.mapper;

import com.andrei.studentPlanification.dto.StudentDto;
import com.andrei.studentPlanification.model.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    StudentDto convertEntityToDto(Student student);
    Student convertDtoToEntity(StudentDto studentDto);
    StudentMapper mapper = Mappers.getMapper(StudentMapper.class);

}
