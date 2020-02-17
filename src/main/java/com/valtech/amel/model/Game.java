package com.valtech.amel.model;

import java.util.ArrayList;
import java.util.List;

public class Game {

    protected int iteration = 0;
    protected List<Frame> frames = new ArrayList<>(10);
    protected String playerName;

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