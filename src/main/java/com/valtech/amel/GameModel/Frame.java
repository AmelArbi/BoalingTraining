package com.valtech.amel.GameModel;

import java.util.ArrayList;
import java.util.List;

public class Frame {

    private List<Integer> throwList = new ArrayList<>(3);

    public Frame() {
    }

    public int getScore() {//sum of throws in one Frame
        return getThrowList().stream().mapToInt(i -> i).sum();
    }

    public boolean isStrike() {
        return (getThrowList().get(0) == 10);
    }

    public boolean isSpare() {
        if (!isStrike()) {
            return ((getThrowList().get(0) + getThrowList().get(1)) == 10);
        } else {
            return false;
        }
    }

    public List<Integer> getThrowList() {
        return throwList;
    }

}
