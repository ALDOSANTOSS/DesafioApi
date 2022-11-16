package com.example.desafioapi.dto.admin;

import com.example.desafioapi.entity.Admin;

public class AdminMapper {

    public static Admin fromDto(RegistroAdminDto dto){
        return new Admin(dto.getEmail(), dto.getPassword());
    }

    public static ConsultaAdminDto fromEntity(Admin admin){
        return new ConsultaAdminDto(admin.getId(), admin.getEmail(), admin.getPassword());
    }
}
