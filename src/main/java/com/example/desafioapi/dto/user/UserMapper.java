package com.example.desafioapi.dto.user;

import com.example.desafioapi.entity.User;

public class UserMapper {

    public static User fromDTO(RegistroUserDTO dto){
        return new User(null,dto.getEmail(), dto.getPassword());
    }

    public static ConsultaUserDTO fromEntity(User user){
        return new ConsultaUserDTO(user.getId(), user.getEmail(), user.getPassword());
    }


}
