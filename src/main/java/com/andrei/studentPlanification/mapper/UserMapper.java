package com.andrei.studentPlanification.mapper;

import com.andrei.studentPlanification.dto.UserDto;
import com.andrei.studentPlanification.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto convertEntityToDto(User user);

    User convertDtoToEntity(UserDto userDto);

    UserMapper mapper = Mappers.getMapper(UserMapper.class);
}
