package com.youtube.java.puzzle.mapper;

import com.youtube.java.puzzle.dto.UserDTO;
import com.youtube.java.puzzle.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(source = "emailId", target = "email")
    @Mapping(source = "contactNo", target = "phoneNo")
    User toEntity(UserDTO userDTO);
    @Mapping(target = "emailId", source = "email")
    @Mapping(target = "contactNo", source = "phoneNo")
    UserDTO toDTO(User user);
    List<UserDTO> toDTOList(List<User> userList);
}
