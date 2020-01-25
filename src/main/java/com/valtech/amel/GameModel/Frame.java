package com.valtech.amel.GameModel;

import java.util.ArrayList;
import java.util.List;

public class Frame {

    private final int number;
    private int bonusCount;

    public int getNumber() {
        return number;
    }

    public int getBonusCount() {
        return bonusCount;
    }

    public void incrementBonusCount(int i) {
        if (i == 1)
            bonusCount++;
        else
            bonusCount += 2;

    }

    public void decrementBonusCount(int i) {
        bonusCount--;

    }

    private int finalScore;
    private final List<Integer> throwList = new ArrayList<>(3);

    public int getNumberOfThrows() {
        return throwList.size();

    }

    public void addBonus(int bonus) {
        finalScore += bonus;
        bonusCount--;
    }

    public void addThrow(int zahl) {
        throwList.add(zahl);
        finalScore += zahl;
    }

    public int getFinalScore() {
        return finalScore;
    }

    public Frame(int number) {
        this.number = number;
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

    public int getScore() {//sum of throws in one Frame
        return getThrowList().stream().mapToInt(i -> i).sum();
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

    private List<Integer> getThrowList() {
        return throwList;
    }

    public int getThrow(int i) {
        return getThrowList().get(i);
    }
}
