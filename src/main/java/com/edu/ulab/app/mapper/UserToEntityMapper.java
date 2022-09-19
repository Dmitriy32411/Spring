package com.edu.ulab.app.mapper;

import com.edu.ulab.app.dto.UserDto;
import com.edu.ulab.app.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserToEntityMapper {
    UserEntity userDtoToUserEntity(UserDto userDto);
    UserDto userEntityToUserDto(UserEntity userEntity);
}
