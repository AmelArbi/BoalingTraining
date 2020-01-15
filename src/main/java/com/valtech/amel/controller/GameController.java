package com.valtech.amel.controller;

import com.valtech.amel.GameModel.Frame;
import com.valtech.amel.GameModel.Game;
import com.valtech.amel.GameView.GameView;

public class GameController {

    int iteration;
    public Game gameModel = new Game();
    public GameView gameView = new GameView();

    public GameController() {
    }

    public GameController(int iteration, Game gameModel, GameView gameView) {
        this.iteration = iteration;
        this.gameModel = gameModel;
        this.gameView = gameView;
    }

    public int getIteration() {
        return iteration;
    }

    public void setIteration(int iteration) {
        this.iteration = iteration;
    }

    public void wurfelnAccept(int zahl) {
        if (gameModel.getFrames().size() <= iteration) {
            Frame frame = new Frame(iteration);
            frame.getThrowList().add(zahl);
            gameModel.getFrames().add(frame);
        } else {
            gameModel.getFrames().get(iteration).getThrowList().add(zahl);
        }
    }

    public int calculateScore(Integer iteration) {

        int sum;
        int bonus = 0;
        if (iteration == 0) {
            sum = gameModel.getFrames().get(0).getScore();
        } else {

            sum = calculateScore(iteration - 1) + gameModel.getFrames().get(iteration).getScore();
            if (gameModel.getFrames().get(iteration - 1).isSpare()) {
                bonus = bonus + gameModel.getFrames().get(iteration).getThrowList().get(0);
            } else if ((gameModel.getFrames().get(iteration - 1).isStrike())) {
                bonus = bonus + gameModel.getFrames().get(iteration).getThrowList().get(0) + gameModel.getFrames()
                        .get(iteration).getThrowList().get(1);
                if ((iteration > 2) && (gameModel.getFrames().get(iteration - 2).isStrike())) {
                    bonus = bonus + gameModel.getFrames().get(iteration).getThrowList().get(0);
                }
            }
        }
        if ((iteration == 9)) {
            if (gameModel.getFrames().get(iteration).isStrike()) {
                bonus = bonus + gameModel.getFrames().get(iteration).getThrowList().get(2) + gameModel.getFrames()
                        .get(iteration).getThrowList().get(3);
            } else if (gameModel.getFrames().get(iteration).isSpare()) {
                bonus = bonus + gameModel.getFrames().get(iteration).getThrowList().get(2);
            }
            if (gameModel.getFrames().get(8).isStrike()) {

                if (gameModel.getFrames().get(9).isStrike()) {
                    bonus = bonus + gameModel.getFrames().get(9).getThrowList().get(2);
                }
            }
        }

        sum = sum + bonus;
        return sum;
    }
}
