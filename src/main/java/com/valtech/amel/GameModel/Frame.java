package com.valtech.amel.GameModel;

import java.util.ArrayList;
import java.util.List;

public class Frame {

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    int nummer;
    private List<Integer> throwList = new ArrayList<>();// statt throw1 und throw2 ich habe eine Liste für throws
    // erstellt

    public Frame(int num) {
        nummer = num;
    }

/*    @Override
    public String toString() {
        if (nummer < 9) {
            return "Frame " + nummer + " [first Throw =" + throwList.get(0) + ", second Throw =" + throwList.get(1)
                    + ", score=" + getScore() + "]";

        } else if (isStrike()) {
            return "Frame " + nummer + " [first Throw =" + throwList.get(0) + ", second Throw =" + throwList.get(1)
                    + ", third Throw =" + throwList.get(2) + ", fourth Throw =" + throwList.get(3) + ", score="
                    + getScore() + "]";
        } else if (isSpare()) {
            return "Frame " + nummer + " [first Throw =" + throwList.get(0) + ", second Throw =" + throwList.get(1)
                    + ", third Throw =" + throwList.get(2) + ", score="
                    + getScore() + "]";

        } else {
            return "Frame " + nummer + " [first Throw =" + throwList.get(0) + ", second Throw =" + throwList.get(1)
                    + ", score=" + getScore() + "]";

        }
    }*/

    public int getScore() {
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

    public void setThrowList(List<Integer> throwList) {
        this.throwList = throwList;
    }
}
