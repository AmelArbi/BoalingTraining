package com.valtech.amel.view;

import java.sql.SQLOutput;
import com.valtech.amel.service.GameService;
import com.valtech.amel.model.Game;
import org.springframework.stereotype.Component;

@Component
public class GameView {

    private final GameService gameService;

    String formatHeader = " %3d |";
    String formatThrow = "%2s|%2s|";
    String formatSum = " %3d |";
    String formatLeerSum = " %3s |";

    String formatLastHeader = "  %3d   |";
    String formatLastThrow = "%2s|%2s|%2s|";
    String formatLastSum = "   %3d  |";
    String formatLastLeerSum = "  %3s   |";

    public GameView(GameService gameService) {
        this.gameService = gameService;
    }

    public void showFrames(Game game) {

        showHeader();
        showThrows(game);
        showScore(game);
    }

    public String renderFrames(Game game) {
        return renderSpielerName(game) + renderHeader() + renderThrows(game) + renderScore(game);
    }

    private void showHeader() {
        System.out.print(renderHeader());
    }

    private String renderSpielerName(Game game){
        return  game.getPlayerName() + "\n";

    }

    private String renderHeader() {
        String ausgabe = "\n";
        ausgabe += "----------------------------------------------------------------\n";
        ausgabe += "|";
        for (int j = 0; j < 9; j++) {
            ausgabe += String.format(formatHeader, j + 1);
        }
        ausgabe += String.format(formatLastHeader, 10);
        ausgabe += "\n";
        ausgabe += "----------------------------------------------------------------\n";
        ausgabe += "|";
        return ausgabe;
    }

    private void showThrows(Game game) {
        System.out.print(renderThrows(game));
    }

    private String renderThrows(Game game) {
        String ausgabe = "";
        for (int k = 0; k < game.getFrames().size(); k++) {
            if (game.getFrames().get(k).isLastFrame()) {
                if (!game.getFrames().get(k).isStrike() && !game.getFrames()
                        .get(k)
                        .isSpare()) {
                    ausgabe += String.format(formatLastThrow,
                            game.getFrames().get(k).getThrow(0),
                            game.getFrames().get(k).getThrow(1), "");
                } else if (game.getFrames().get(k).isSpare()) {
                    if (!game.getFrames().get(k).isComplete()) {
                        ausgabe += String.format(formatLastThrow,
                                game.getFrames().get(k).getThrow(0),
                                game.getFrames().get(k).getThrow(1), "");
                    } else {
                        ausgabe += String.format(formatLastThrow,
                                game.getFrames().get(k).getThrow(0),
                                game.getFrames().get(k).getThrow(1),
                                game.getFrames().get(k).getThrow(2));

                    }
                } else {
                    if (!game.getFrames().get(k).isComplete()) {
                        ausgabe += String.format(formatLastThrow,
                                game.getFrames().get(k).getThrow(0),
                                "",
                                "");
                    } else {
                        ausgabe += String.format(formatLastThrow,
                                game.getFrames().get(k).getThrow(0),
                                game.getFrames().get(k).getThrow(1),
                                game.getFrames().get(k).getThrow(2));
                    }
                }
            } else if (!game.getFrames().get(k).isStrike()) {
                ausgabe += String.format(formatThrow,
                        game.getFrames().get(k).getThrow(0),
                        game.getFrames().get(k).getThrow(1));
            } else {
                ausgabe += String.format(formatThrow,
                        game.getFrames().get(k).getThrow(0), "");
            }
        }
        for (int l = game.getFrames().size(); l < 9; l++) {
            ausgabe += String.format(formatThrow, "", "");
        }
        if (game.getFrames().size() != 10) {
            ausgabe += String.format(formatLastThrow, "", "", "");
        }
        ausgabe += "\n";
        ausgabe += "----------------------------------------------------------------\n";
        ausgabe += "|";
        return ausgabe;
    }

    private void showScore(Game game) {
        System.out.print(renderScore(game));
    }

    private String renderScore(Game game) {
        String ausgabe = "";
        for (int l = 0; l < game.getFrames().size(); l++) {

            if (!game.getFrames().get(l).isLastFrame())
                ausgabe += String.format(formatSum, gameService.calculateScore(game, l + 1));
            else
                ausgabe += String.format(formatLastSum, gameService.calculateScore(game, l + 1));
        }
        for (int l = game.getFrames().size(); l < 9; l++) {
            ausgabe += String.format(formatLeerSum, "");
        }
        if (game.getFrames().size() != 10) {
            ausgabe += String.format(formatLastLeerSum, "", "", "");
        }
        ausgabe += "\n";
        ausgabe += "----------------------------------------------------------------";
        ausgabe += "\n";
        return ausgabe;
    }

}
