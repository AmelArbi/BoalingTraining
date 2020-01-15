package com.valtech.amel;

public class GameController {
    int iteration;
    GameModel gameModel = new GameModel();
    GameView gameView = new GameView();

    public static void main(String[] args) {
        GameController gameController = new GameController();

}

    public void wurfelnAccept(int zahl) {
        if (gameModel.frames.size() <= iteration) {
            Frame frame = new Frame(iteration);
            frame.throwList.add(zahl);
            gameModel.frames.add(frame);
        } else {
            gameModel.frames.get(iteration).throwList.add(zahl);
        }
    }

    int calculateScore(Integer iteration) {
        int sum;
        int bonus = 0;
        if (iteration == 0) {
            sum = gameModel.frames.get(0).getScore();
        } else {

            sum = calculateScore(iteration - 1) + gameModel.frames.get(iteration).getScore();
            if (gameModel.frames.get(iteration - 1).isSpare()) {
                bonus = bonus + gameModel.frames.get(iteration).throwList.get(0);
            } else if ((gameModel.frames.get(iteration - 1).isStrike())) {
                bonus = bonus + gameModel.frames.get(iteration).throwList.get(0) + gameModel.frames.get(iteration).throwList.get(1);
                if ((iteration > 2) && (gameModel.frames.get(iteration - 2).isStrike())) {
                    bonus = bonus + gameModel.frames.get(iteration).throwList.get(0);
                }
            }
        }
        if ((iteration == 9)) {
            if (gameModel.frames.get(iteration).isStrike()) {
                bonus = bonus + gameModel.frames.get(iteration).throwList.get(2) + gameModel.frames.get(iteration).throwList.get(3);
            } else if (gameModel.frames.get(iteration).isSpare()) {
                bonus = bonus + gameModel.frames.get(iteration).throwList.get(2);
            }
            if (gameModel.frames.get(8).isStrike()) {

                if (gameModel.frames.get(9).isStrike()) {
                    bonus = bonus + gameModel.frames.get(9).throwList.get(2);
                }
            }
        }

        sum = sum + bonus;
        return sum;
    }
}
