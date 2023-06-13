package com.devsuperior.dslist.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_game_list")
public class GameList
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public GameList(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
