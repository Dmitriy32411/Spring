package com.edu.ulab.app.service.impl;

import com.edu.ulab.app.dto.UserDto;

import com.edu.ulab.app.entity.UserEntity;
import com.edu.ulab.app.mapper.UserToEntityMapper;
import com.edu.ulab.app.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service

public class UserServiceImpl implements UserService {
    private final UserToEntityMapper mapper;



    @Override
    public UserDto createUser(UserDto userDto) {
        // сгенерировать идентификатор

        // создать пользователя
        // вернуть сохраненного пользователя со всеми необходимыми полями id
        userDto.setId(1L);

        UserEntity userEntity = mapper.userDtoToUserEntity(userDto);

        return userDto;
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        return null;
    }

    @Override
    public UserDto getUserById(Long id) {
        return null;
    }

    @Override
    public void deleteUserById(Long id) {

    }
}
