package com.valtech.amel.model;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



public class Game {

    private int iteration = 0;
    private List<Frame> frames = new ArrayList<>(10);
    private String playerName;

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