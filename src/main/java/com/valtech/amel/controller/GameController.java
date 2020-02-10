package com.valtech.amel.controller;

import com.valtech.amel.model.Frame;
import com.valtech.amel.model.Game;
import com.valtech.amel.view.GameView;

public class GameController {

    private Game game = new Game();
    private GameView gameView = new GameView();

    public Game getGame() {
        return game;
    }

    public GameView getGameView() {
        return gameView;
    }

    public Frame getFrame(int iteration) {
        return game.getFrames().get(iteration);
    }

    public void wurfelnAccept(int zahl) {
        if (game.getIteration() <= 9) {
            if (game.getFrames().size() == game.getIteration()) {
                wuerfelnAcceptNewFrame(zahl);
            } else {
                wuerfelnAcceptExistingFrame(zahl);
            }
        }
    }

    private void wuerfelnAcceptNewFrame(int zahl) {
        Frame frame = new Frame(game.getIteration());
        frame.addThrow(zahl);
        game.getFrames().add(frame);

        if (frame.isComplete()) {
            addBonus(game.getIteration());
            game.setIteration(game.getIteration() + 1);
        }
    }

    private void wuerfelnAcceptExistingFrame(int zahl) {
        Frame currentFrame = game.getFrames().get(game.getIteration());
        currentFrame.addThrow(zahl);

        if (currentFrame.isComplete()) {
            addBonus(game.getIteration());
            game.setIteration(game.getIteration() + 1);
        }
    }

    public void addBonus(int iteration) {
        Frame currentFrame = game.getFrames().get(iteration);
        if (iteration > 0) {
            Frame prevFrame = game.getFrames().get(iteration - 1);
            addBonus(iteration, currentFrame, prevFrame);
        }
    }

    private void addBonus(int iteration, Frame currentFrame, Frame prevFrame) {
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
            if (iteration < 9) {

                if (!currentFrame.isStrike()) {
                    prevFrame.addBonus(currentFrame.getThrow(1));
                }
            } else if (iteration == 9) {
                prevFrame.addBonus(currentFrame.getThrow(1));

            }
        }
    }

    public int calculateScore() {
        return calculateScoreWithFullScore(game.getIteration());

    }

    public int calculateScoreWithFullScore(int iteration) {
        int sum = 0;
        for (int i = 0; i < iteration; i++) {
            sum += game.getFrames().get(i).getFinalScore();
        }
        return sum;
    }
}
