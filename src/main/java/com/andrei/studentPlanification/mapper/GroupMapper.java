package com.andrei.studentPlanification.mapper;

import com.andrei.studentPlanification.dto.GroupDto;
import com.andrei.studentPlanification.model.Group;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface GroupMapper {

    GroupDto convertEntityToDto (Group group);
    Group convertDtoToEntity (GroupDto groupDto);
    GroupMapper mapper = Mappers.getMapper(GroupMapper.class);

}
