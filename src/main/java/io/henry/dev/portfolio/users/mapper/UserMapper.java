package io.henry.dev.portfolio.users.mapper;

import io.henry.dev.portfolio.users.UserDTO;
import io.henry.dev.portfolio.users.model.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {


    // @Mapping(target = "projects", ignore = true)
    UserDTO toUserDTO(UserEntity userEntity);
    UserEntity toUserEntity(UserDTO userDTO);
}
