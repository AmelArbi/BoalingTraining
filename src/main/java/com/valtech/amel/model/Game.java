package com.valtech.amel.model;

import java.util.ArrayList;
import java.util.List;

public class Game {

    public int iteration = 0;

    public int getIteration() {
        return iteration;
    }

    public void setIteration(int iteration) {
        this.iteration = iteration;
    }

    private List<Frame> frames = new ArrayList<>(10);
    String playerName;

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