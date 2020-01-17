package com.valtech.amel.controller;

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

    public void setIteration(int iteration) {
        this.iteration = iteration;
    }

    public void wurfelnAccept(int zahl) {
        if (game.getFrames().size() <= iteration) {
            Frame frame = new Frame();
            frame.getThrowList().add(zahl);
            game.getFrames().add(frame);
        } else {
            game.getFrames().get(iteration).getThrowList().add(zahl);

        }
    }

    public int calculateScore(Integer iteration) {
        int sum = game.getFrames().get(iteration).getScore();
        int bonus = 0;
        if (iteration > 0) {
            sum = sum + calculateScore(iteration - 1);
            if (game.getFrames().get(iteration - 1).isSpare()) {
                bonus = bonus + game.getFrames().get(iteration).getThrowList().get(0);
            } else if ((game.getFrames().get(iteration - 1).isStrike())) {

                bonus = bonus + game.getFrames().get(iteration).getThrowList().get(0) + game.getFrames()
                        .get(iteration).getThrowList().get(1);

                if (iteration >= 2) {
                    if (game.getFrames().get(iteration - 2).isStrike() && game.getFrames().get(iteration - 1)
                            .isStrike()) {
                        bonus = bonus + game.getFrames().get(iteration).getThrowList().get(0);
                    }
                }

            }

        }
        sum = sum + bonus;
        return sum;
    }
}
