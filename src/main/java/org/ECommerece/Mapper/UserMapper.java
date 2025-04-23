package org.ECommerece.Mapper;

import org.ECommerece.Dto.UserResponseDTO;
import org.ECommerece.Entity.User;

public class UserMapper {
    public static UserResponseDTO toUserResponseDto(User user){
        UserResponseDTO userResponseDTO = new UserResponseDTO();
        userResponseDTO.setId(user.getId());
        userResponseDTO.setName(user.getName());
        userResponseDTO.setEmail(user.getEmail());
        return userResponseDTO;
    }
}
