package com.valtech.amel.view;

import java.util.List;
import com.valtech.amel.controller.GameController;
import com.valtech.amel.model.Frame;

public class GameView {

    String formatHeader = " %3d |";
    String formatThrow = "%2s|%2s|";
    String formatSum = " %3d |";
    String formatLeerSum = " %3s |";

    String formatLastHeader = "  %3d   |";
    String formatLastThrow = "%2s|%2s|%2s|";
    String formatLastSum = "   %3d  |";
    String formatLastLeerSum = "  %3s   |";

    public void printFrames(List<Frame> frames, int score) {
        String message = "";
        for (int i = 0; i < frames.size(); i++) {
            message = "Frame " + (i + 1) + " Throws = ";

            for (int j = 0; j < frames.get(i).getNumberOfThrows(); j++) {
                message = message + frames.get(i).getThrow(j) + ",  ";
            }
            message = message + "score=" + frames.get(i).getScore();
            System.out.println(message);
            System.out.println("between score : " + score);

        }
    }

    public void showFrames(GameController gameController) {
        System.out.println();
        System.out.println("----------------------------------------------------------------");

        System.out.print("|");
        for (int j = 0; j < 9; j++) {
            System.out.format(formatHeader, j + 1);
        }
        System.out.format(formatLastHeader, 10);

        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.print("|");

        for (int k = 0; k < gameController.getGame().getFrames().size(); k++) {

            if (gameController.getGame().getFrames().get(k).isLastFrame()) {
                if (!gameController.getGame().getFrames().get(k).isStrike() && !gameController.getGame().getFrames().get(k)
                        .isSpare()) {
                    System.out.format(formatLastThrow,
                            gameController.getGame().getFrames().get(k).getThrow(0),
                            gameController.getGame().getFrames().get(k).getThrow(1), "");

                } else if (gameController.getGame().getFrames().get(k).isSpare()) {
                    if (!gameController.getGame().getFrames().get(k).isComplete()) {
                        System.out.format(formatLastThrow,
                                gameController.getGame().getFrames().get(k).getThrow(0),
                                gameController.getGame().getFrames().get(k).getThrow(1), "");

                    } else {
                        System.out.format(formatLastThrow,
                                gameController.getGame().getFrames().get(k).getThrow(0),
                                gameController.getGame().getFrames().get(k).getThrow(1),
                                gameController.getGame().getFrames().get(k).getThrow(2));

                    }

                } else {
                    if (!gameController.getGame().getFrames().get(k).isComplete()) {
                        System.out.format(formatLastThrow,
                                gameController.getGame().getFrames().get(k).getThrow(0),
                                "",
                                "");

                    } else {
                        System.out.format(formatLastThrow,
                                gameController.getGame().getFrames().get(k).getThrow(0),
                                gameController.getGame().getFrames().get(k).getThrow(1),
                                gameController.getGame().getFrames().get(k).getThrow(2));

                    }

                }

            } else if (!gameController.getGame().getFrames().get(k).isStrike()) {
                System.out.format(formatThrow,
                        gameController.getGame().getFrames().get(k).getThrow(0),
                        gameController.getGame().getFrames().get(k).getThrow(1));

            } else {
                System.out.format(formatThrow,
                        gameController.getGame().getFrames().get(k).getThrow(0), "");

            }

        }
        for (int l = gameController.getGame().getFrames().size(); l < 9; l++) {

            System.out.format(formatThrow, "", "");

        }
        if (gameController.getGame().getFrames().size() != 10)
            System.out.format(formatLastThrow, "", "", "");

        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.print("|");
        for (int l = 0; l < gameController.getGame().getFrames().size(); l++) {
            if (!gameController.getGame().getFrames().get(l).isLastFrame())
                System.out.format(formatSum, gameController.calculateScoreWithFullScore(l + 1));
            else
                System.out.format(formatLastSum, gameController.calculateScoreWithFullScore(l + 1));

        }
        for (int l = gameController.getGame().getFrames().size(); l < 9; l++) {
            System.out.format(formatLeerSum, "");

        }
        if (gameController.getGame().getFrames().size() != 10)
            System.out.format(formatLastLeerSum, "", "", "");

        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println();

    }
}
