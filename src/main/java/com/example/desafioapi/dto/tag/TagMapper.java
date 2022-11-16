package com.example.desafioapi.dto.tag;

import com.example.desafioapi.entity.Tag;

public class TagMapper {

    public static Tag fromDTO(RegistroTagDTO dto){
        return new Tag(dto.getName());
    }


    public static ConsultaTagDTO fromEntity(Tag tag){
        return new ConsultaTagDTO(tag.getId(),tag.getName());
    }
}
