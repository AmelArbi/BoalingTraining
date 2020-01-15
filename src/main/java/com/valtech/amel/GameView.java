package com.valtech.amel;
//ohne toStringMethode aus Frameklasse

import java.util.List;

public class GameView{
    void printFrames(List<Frame>frames) {
        for (int i = 0;i<frames.size()-1;i++){
            if (frames.get(i).nummer < 9) {
                System.out.println( "Frame " + frames.get(i).nummer + " [first Throw =" + frames.get(i).throwList.get(0) + ", second Throw =" + frames.get(i).throwList.get(1)
                        + ", score=" + frames.get(i).getScore() + "]");
            } else if (frames.get(i).isStrike()) {
                System.out.println("Frame " + frames.get(i).nummer + " [first Throw =" + frames.get(i).throwList.get(0) + ", second Throw =" + frames.get(i).throwList.get(1)
                        + ", third Throw =" + frames.get(i).throwList.get(2) + ", fourth Throw =" +frames.get(i).throwList.get(3) + ", score="
                        + frames.get(i).getScore()+ "]");
            } else if (frames.get(i).isSpare()) {
                System.out.println( "Frame " + frames.get(i).nummer + " [first Throw =" + frames.get(i).throwList.get(0) + ", second Throw =" + frames.get(i).throwList.get(1)
                        + ", third Throw =" + frames.get(i).throwList.get(2) + ", score="
                        + frames.get(i).getScore() + "]");

            } else {
                System.out.println( "Frame " + frames.get(i).nummer + " [first Throw =" + frames.get(i).throwList.get(0) + ", second Throw =" + frames.get(i).throwList.get(1)
                        + ", score=" + frames.get(i).getScore() + "]");

            }
        }
    }
}
