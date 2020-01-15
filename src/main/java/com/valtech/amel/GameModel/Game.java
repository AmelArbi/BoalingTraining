package com.valtech.amel.GameModel;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Frame> frames = new ArrayList<>(10);

    public List<Frame> getFrames() {
        return frames;
    }

    public void setFrames(List<Frame> frames) {
        this.frames = frames;
    }
}