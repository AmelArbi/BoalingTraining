package com.valtech.amel.GameView;
//ohne toStringMethode aus Frameklasse

import java.util.List;
import com.valtech.amel.GameModel.Frame;

public class GameView {

    public void printFrames(List<Frame> frames) {
        for (int i = 0; i < frames.size() - 1; i++) {
            if (frames.get(i).getNummer() < 9) {
                System.out.println(
                        "Frame " + frames.get(i).getNummer() + " [first Throw =" + frames.get(i).getThrowList().get(0)
                                + ", second Throw =" + frames.get(i).getThrowList().get(1)
                                + ", score=" + frames.get(i).getScore() + "]");
            } else if (frames.get(i).isStrike()) {
                System.out.println(
                        "Frame " + frames.get(i).getNummer() + " [first Throw =" + frames.get(i).getThrowList().get(0)
                                + ", second Throw =" + frames.get(i).getThrowList().get(1)
                                + ", third Throw =" + frames.get(i).getThrowList().get(2) + ", fourth Throw =" + frames
                                .get(i).getThrowList().get(3) + ", score="
                                + frames.get(i).getScore() + "]");
            } else if (frames.get(i).isSpare()) {
                System.out.println(
                        "Frame " + frames.get(i).getNummer() + " [first Throw =" + frames.get(i).getThrowList().get(0)
                                + ", second Throw =" + frames.get(i).getThrowList().get(1)
                                + ", third Throw =" + frames.get(i).getThrowList().get(2) + ", score="
                                + frames.get(i).getScore() + "]");

            } else {
                System.out.println(
                        "Frame " + frames.get(i).getNummer() + " [first Throw =" + frames.get(i).getThrowList().get(0)
                                + ", second Throw =" + frames.get(i).getThrowList().get(1)
                                + ", score=" + frames.get(i).getScore() + "]");

            }
        }
    }
}
