package com.andrei.studentPlanification.service;

import com.andrei.studentPlanification.dto.UserDto;
import com.andrei.studentPlanification.mapper.UserMapper;
import com.andrei.studentPlanification.model.User;
import com.andrei.studentPlanification.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void createUserAccount(UserDto userDto) {
        User user= UserMapper.mapper.convertDtoToEntity(userDto);
        userRepository.save(user);
    }
}