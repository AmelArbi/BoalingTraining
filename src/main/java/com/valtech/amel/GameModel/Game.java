package com.valtech.amel.GameModel;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Frame> frames = new ArrayList<>(10);

    private int Number;
    String playerName;

    public void setNumber(int number) {
        Number = number;
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