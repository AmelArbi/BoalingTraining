package com.valtech.amel.view;

import java.util.List;
import com.valtech.amel.controller.GameController;
import com.valtech.amel.model.Frame;
import com.valtech.amel.model.Game;

public class GameView {

    GameController gameController= new GameController();

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

    public void showFrames(Game game) {
        showHeader();
        showThrows(game);
        showScore(game);
    }

    private void showHeader() {
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
    }

    private void showThrows(Game game) {
        for (int k = 0; k < game.getFrames().size(); k++) {
            if (game.getFrames().get(k).isLastFrame()) {
                if (!game.getFrames().get(k).isStrike() && !game.getFrames()
                        .get(k)
                        .isSpare()) {
                    System.out.format(formatLastThrow,
                            game.getFrames().get(k).getThrow(0),
                            game.getFrames().get(k).getThrow(1), "");
                } else if (game.getFrames().get(k).isSpare()) {
                    if (!game.getFrames().get(k).isComplete()) {
                        System.out.format(formatLastThrow,
                                game.getFrames().get(k).getThrow(0),
                                game.getFrames().get(k).getThrow(1), "");
                    } else {
                        System.out.format(formatLastThrow,
                                game.getFrames().get(k).getThrow(0),
                                game.getFrames().get(k).getThrow(1),
                                game.getFrames().get(k).getThrow(2));

                    }
                } else {
                    if (!game.getFrames().get(k).isComplete()) {
                        System.out.format(formatLastThrow,
                                game.getFrames().get(k).getThrow(0),
                                "",
                                "");
                    } else {
                        System.out.format(formatLastThrow,
                                game.getFrames().get(k).getThrow(0),
                                game.getFrames().get(k).getThrow(1),
                                game.getFrames().get(k).getThrow(2));
                    }
                }
            } else if (!game.getFrames().get(k).isStrike()) {
                System.out.format(formatThrow,
                        game.getFrames().get(k).getThrow(0),
                        game.getFrames().get(k).getThrow(1));
            } else {
                System.out.format(formatThrow,
                        game.getFrames().get(k).getThrow(0), "");
            }
        }
        for (int l = game.getFrames().size(); l < 9; l++) {
            System.out.format(formatThrow, "", "");
        }
        if (game.getFrames().size() != 10)
        {System.out.format(formatLastThrow, "", "", "");}
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.print("|");
    }

    private void showScore(Game game) {
        for (int l = 0; l < game.getFrames().size(); l++) {

            if (!game.getFrames().get(l).isLastFrame())
                System.out.format(formatSum, gameController.calculateScore(game,l + 1));
            else
                System.out.format(formatLastSum, gameController.calculateScore(game, l + 1));
        }
        for (int l = game.getFrames().size(); l < 9; l++) {
            System.out.format(formatLeerSum, "");
        }
        if (game.getFrames().size() != 10) {
            System.out.format(formatLastLeerSum, "", "", "");
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println();
    }

}
