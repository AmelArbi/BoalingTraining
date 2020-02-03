package com.valtech.amel.controller;

import com.valtech.amel.model.Frame;
import com.valtech.amel.model.Game;
import com.valtech.amel.view.GameView;

public class GameController {

    public int iteration = 0;
    public Game game = new Game();
    public GameView gameView = new GameView();

    public int getIteration() {
        return iteration;
    }

    public Frame getFrame(int iteration) {
        return game.getFrames().get(iteration);

    }

    public void wurfelnAccept(int zahl) {
        if (game.getFrames().size() == iteration) {
            wuerfelnAcceptNewFrame(zahl);
        } else {
            wuerfelnAcceptExistingFrame(zahl);
        }
    }

    private void wuerfelnAcceptNewFrame(int zahl) {
        Frame frame = new Frame(iteration);
        frame.addThrow(zahl);
        game.getFrames().add(frame);

        if (frame.isComplete()) {
            addBonus(iteration);
            iteration++;
        }

    }

    private void wuerfelnAcceptExistingFrame(int zahl) {
        Frame currentFrame = game.getFrames().get(iteration);
        currentFrame.addThrow(zahl);

        if (currentFrame.isComplete()) {
            addBonus(iteration);
            iteration++;
        }

    }

    public void addBonus(int iteration) {
        Frame currentFrame = game.getFrames().get(iteration);

        if (iteration > 0) {
            Frame prevFrame = game.getFrames().get(iteration - 1);

            if (iteration < 9) {

                addBonusBeforeLastFrame(iteration, currentFrame, prevFrame);

            } else if (iteration == 9) {
                addBonusLastFrame(iteration, currentFrame, prevFrame);

            }

        }

    }

    private void addBonusBeforeLastFrame(int iteration, Frame currentFrame, Frame prevFrame) {
        if (iteration >= 2) {
            Frame prePrevFrame = game.getFrames().get(iteration - 2);

            if (prePrevFrame.isStrike() && prevFrame.isStrike()) {
                prePrevFrame.addBonus(currentFrame.getThrow(0));
            }

        }
        if (prevFrame.isSpare()) {
            prevFrame.addBonus(currentFrame.getThrow(0));
        } else if ((prevFrame.isStrike())) {
            prevFrame.addBonus(currentFrame.getThrow(0));
            if (!currentFrame.isStrike()) {
                prevFrame.addBonus(currentFrame.getThrow(1));
            }
        }

    }

    private void addBonusLastFrame(int iteration, Frame currentFrame, Frame prevFrame) {
        Frame prePrevFrame = game.getFrames().get(iteration - 2);
        if (prePrevFrame.isStrike() && prevFrame.isStrike()) {
            prePrevFrame.addBonus(currentFrame.getThrow(0));
        }

        if (prevFrame.isSpare()) {
            prevFrame.addBonus(currentFrame.getThrow(0));
        } else if ((prevFrame.isStrike())) {
            prevFrame.addBonus(currentFrame.getThrow(0));
            prevFrame.addBonus(currentFrame.getThrow(1));

        }

    }

    public int calculateScore() {
        return calculateScoreWithFullScore(iteration);

    }

    public int calculateScoreWithFullScore(int iteration) {
        int sum = 0;
        for (int i = 0; i < iteration; i++) {
            sum += game.getFrames().get(i).getFinalScore();
        }
        return sum;
    }

}
