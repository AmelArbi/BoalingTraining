package com.valtech.amel.controller;

import java.util.stream.Collectors;
import com.valtech.amel.GameModel.Frame;
import com.valtech.amel.GameModel.Game;
import com.valtech.amel.GameView.GameView;

public class GameController {

    public int iteration = 0;
    public Game game = new Game();
    public GameView gameView = new GameView();

    public GameController() {
    }

    public int getIteration() {
        return iteration;
    }

    public void wurfelnAccept(int zahl) {
        System.out.println("zahl = " + zahl);
        if (game.getFrames().size() == iteration) {
            wuerfelnAcceptNewFrame(zahl);
        } else {
            wuerfelnAcceptExistingFrame(zahl);
        }
    }

    private void wuerfelnAcceptNewFrame(int zahl) {
        Frame frame = new Frame(iteration);
        frame.getThrowList().add(zahl);
        game.getFrames().add(frame);
        if (frame.isComplete()) {
            iteration++;
            System.out.println("iteration = " + iteration);
        }

    }

    private void wuerfelnAcceptExistingFrame(int zahl) {
        Frame currentFrame = game.getFrames().get(iteration);
        currentFrame.getThrowList().add(zahl);
        if (currentFrame.isComplete()) {
            iteration++;
            System.out.println("iteration = " + iteration);
        }

    }

    public int calculateScore() {
        //return calculateScoreForward(iteration - 1);
        return calculateScore(iteration - 1);

    }

    public int calculateScoreForward(int iteration) {
        int sum = 0;
        int index = 0;
        int[] factor = new int[24];

        for (int i = 0; i < iteration + 1; i++) {
            Frame frame = game.getFrames().get(i);
            for (int j = 0; j < frame.getThrowList().size(); j++) {
                index++;
                sum = sum + frame.getThrowList().get(j) * (factor[index] + 1);
            }
            if (frame.isStrike()) {
                factor[index + 1]++;
                factor[index + 2]++;
            } else if (frame.isSpare()) {
                factor[index + 1]++;
            }
        }
        return sum;
    }

    private int calculateScore(int iteration) {
        Frame currentFrame = game.getFrames().get(iteration);
        int bonus = getBonus(iteration);

        int sum = currentFrame.getScore();
        if (iteration > 0)
            sum = sum + calculateScore(iteration - 1);
        sum = sum + bonus;
        return sum;
    }

    public int getBonus(int iteration) {
        Frame currentFrame = game.getFrames().get(iteration);
        int bonus = 0;
        if (iteration > 0) {
            Frame prevFrame = game.getFrames().get(iteration - 1);

            if (prevFrame.isSpare()) {
                bonus = bonus + currentFrame.getThrowList().get(0);
            } else if ((prevFrame.isStrike())) {
                bonus = bonus + currentFrame.getThrowList().get(0);
                if (!currentFrame.isStrike()) {
                    bonus = bonus + currentFrame.getThrowList().get(1);
                }
            }

            if (iteration >= 2) {
                Frame prePrevFrame = game.getFrames().get(iteration - 2);
                if (prePrevFrame.isStrike() && prevFrame.isStrike()) {
                    bonus = bonus + currentFrame.getThrowList().get(0);
                }
            }

            if (iteration == 9 && prevFrame.isStrike() && !currentFrame.isSpare()) {
                bonus = bonus + currentFrame.getThrowList().get(1);
            }
        }

        return bonus;
    }

}
