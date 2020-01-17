package com.valtech.amel.GameView;
//ohne toStringMethode aus Frameklasse

import java.util.List;
import com.valtech.amel.GameModel.Frame;

public class GameView {

    public void printFrames(List<Frame> frames) {
        String message = "";
        for (int i = 0; i < frames.size(); i++) {
            message = "Frame " + i + " Throws = ";

            for (int j = 0; j < frames.get(i).getThrowList().size(); j++) {

                message = message + frames.get(i).getThrowList().get(j) + ",  ";

            }
            message = message + "score=" + frames.get(i).getScore();
            System.out.println(message);

        }
    }
}
