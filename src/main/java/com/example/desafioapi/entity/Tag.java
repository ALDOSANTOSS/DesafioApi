package com.example.desafioapi.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_tag")
public class Tag {


    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
