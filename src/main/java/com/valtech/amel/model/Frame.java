package com.valtech.amel.model;

import java.util.ArrayList;
import java.util.List;


public class Frame {

    private final int number;
    private int finalScore;
    private final List<Integer> throwList = new ArrayList<>(3);

    public Frame(int number) {
        this.number = number;
    }

    public int getNumberOfThrows() {
        return throwList.size();

    }

    public int getNumber() {
        return number;
    }

    public List<Integer> getThrowList() {
        return throwList;
    }

    public int getThrow(int i) {
        return getThrowList().get(i);
    }

    public int getFinalScore() {
        return finalScore;
    }


    public void addThrow(int zahl) {

        throwList.add(zahl);
        finalScore += zahl;

    }

    public void addBonus(int bonus) {
        finalScore += bonus;
    }



    public boolean isComplete() {
        if (!isLastFrame()) {
            if (getThrowList().size() == 2)
                return true;
            if (isStrike())
                return true;
        } else {
            if (!isStrike() && !isSpare()) {
                if (getThrowList().size() == 2) {
                    return true;
                }
            } else {
                if (getThrowList().size() == 3) {
                    return true;
                }
            }

        }
        return false;
    }

    public boolean isLastFrame() {
        return number == 9;

    }

    public boolean isStrike() {
        return (getThrowList().get(0) == 10);
    }

    public boolean isSpare() {
        if (!isStrike()) {
            return getThrowList().size() > 1 && ((getThrowList().get(0) + getThrowList().get(1)) == 10);
        } else {
            return false;
        }
    }

}
