package com.example.desafioapi.dto.tag;

public class RegistroTagDTO {

    private String name;

    public RegistroTagDTO() {
    }

    public RegistroTagDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
