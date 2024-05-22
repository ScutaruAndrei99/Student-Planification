package com.andrei.studentPlanification.mapper;

import com.andrei.studentPlanification.dto.SubjectsDto;
import com.andrei.studentPlanification.model.Subjects;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface SubjectsMapper {

    SubjectsDto convertEntityToDto(Subjects subjects);
    Subjects convertDtoToEntity(SubjectsDto subjectsDto);
    SubjectsMapper mapper = Mappers.getMapper(SubjectsMapper.class);
}
