package com.valtech.amel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Data
//@RequiredArgsConstructor
public class Game {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  Long id;

    public Game() {}
    public Game(long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
