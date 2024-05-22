package com.andrei.studentPlanification.mapper;

import com.andrei.studentPlanification.dto.YearDto;
import com.andrei.studentPlanification.model.Year;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface YearMapper {

    YearDto convertEntityToDto(Year year);
    Year convertDtoToEntity(YearDto yearDto);
    YearMapper mapper = Mappers.getMapper(YearMapper.class);
}
