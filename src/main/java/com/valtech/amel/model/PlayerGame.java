package com.valtech.amel.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class PlayerGame {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;


    protected int iteration = 0;
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    protected List<Frame> frames = new ArrayList<>(10);
    protected String playerName;

    public PlayerGame() {
    }

    public int getIteration() {
        return iteration;
    }

    public void setIteration(int iteration) {
        this.iteration = iteration;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }



    public List<Frame> getFrames() {
        return frames;
    }

}