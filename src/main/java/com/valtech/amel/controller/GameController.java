package com.valtech.amel.controller;

import com.valtech.amel.GameModel.Frame;
import com.valtech.amel.GameModel.Game;
import com.valtech.amel.GameView.GameView;

public class GameController {

    int iteration;
    public Game game = new Game();
    public GameView gameView = new GameView();

    public GameController() {
    }

    public GameController(int iteration, Game game, GameView gameView) {
        this.iteration = iteration;
        this.game = game;
        this.gameView = gameView;
    }

    public int getIteration() {
        return iteration;
    }

    public void setIteration(int iteration) {
        this.iteration = iteration;
    }

    public void wurfelnAccept(int zahl) {
        if (game.getFrames().size() <= iteration) {
            Frame frame = new Frame(iteration);
            frame.getThrowList().add(zahl);
            game.getFrames().add(frame);
        } else {
            game.getFrames().get(iteration).getThrowList().add(zahl);
        }

    }

    public int calculateScore(Integer iteration) {

        int sum;
        int bonus = 0;
        if (iteration == 0) {
            sum = game.getFrames().get(0).getScore();
        } else {

            sum = calculateScore(iteration - 1) + game.getFrames().get(iteration).getScore();
            if (game.getFrames().get(iteration - 1).isSpare()) {
                bonus = bonus + game.getFrames().get(iteration).getThrowList().get(0);
            } else if ((game.getFrames().get(iteration - 1).isStrike())) {
                bonus = bonus + game.getFrames().get(iteration).getThrowList().get(0) + game.getFrames()
                        .get(iteration).getThrowList().get(1);
                if ((iteration > 2) && (game.getFrames().get(iteration - 2).isStrike())) {
                    bonus = bonus + game.getFrames().get(iteration).getThrowList().get(0);
                }
            }
        }
        if ((iteration == 9)) {
            if (game.getFrames().get(iteration).isStrike()) {
                bonus = bonus + game.getFrames().get(iteration).getThrowList().get(2) + game.getFrames()
                        .get(iteration).getThrowList().get(3);
            } else if (game.getFrames().get(iteration).isSpare()) {
                bonus = bonus + game.getFrames().get(iteration).getThrowList().get(2);
            }
            if (game.getFrames().get(8).isStrike()) {

                if (game.getFrames().get(9).isStrike()) {
                    bonus = bonus + game.getFrames().get(9).getThrowList().get(2);
                }
            }
        }

        sum = sum + bonus;
        return sum;
    }
}
