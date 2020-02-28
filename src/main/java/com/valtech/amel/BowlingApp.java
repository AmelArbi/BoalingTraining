package com.valtech.amel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.valtech.amel.service.GameService;
import com.valtech.amel.model.PlayerGame;
import com.valtech.amel.view.GameView;

public class BowlingApp {

    Scanner myScanner = new Scanner(System.in);
    List<PlayerGame> playersGames = new ArrayList<>(6);
    GameService gameService = new GameService();
    private GameView gameView = new GameView(gameService);

    public static void main(String[] args) {
        BowlingApp bowlingApp = new BowlingApp();
        bowlingApp.startGame();

    }

    private void startGame() {
        int numberOfPlayers = getValidNumber("Please Enter the number of Players : ", 2, 6);
        setGames(numberOfPlayers);
        playGame(numberOfPlayers);
    }

    int getValidNumber(String message, int x, int y) {
        boolean valid = false;
        int zahl = 0;

        while (!valid) {
            System.out.print(message);
            try {
                zahl = Integer.parseInt(myScanner.nextLine());
                if (zahl >= x && zahl <= y)
                    valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number !");

            }
        }
        return zahl;

    }

    private void setGames(int numberOfPlayers) {
        for (int i = 0; i < numberOfPlayers; i++) {
            playersGames.add(new PlayerGame());
            System.out.println("Please enter the name of the player number " + (i + 1) + " : ");
            playersGames.get(i).setPlayerName(myScanner.nextLine());
        }
    }

    private void playGame(int numberOfPlayers) {
        System.out.println(" ------------------------Game Start--------------------------------------------------");
        for (int iteration = 0; iteration < 10; iteration++) {
            playIteration(numberOfPlayers, iteration);
        }
    }

    private void playIteration(int numberOfPlayers, int iteration) {
        String ausgabe = "";
        ausgabe = " ------------------------Iteration " + (iteration + 1) + "----------------------------";
        System.out.println(ausgabe);
        for (int j = 0; j < numberOfPlayers; j++) {
            getTurn(playersGames.get(j), iteration);
            System.out.println();
            System.out.println("Score table of " + playersGames.get(j).getPlayerName());
            gameView.showFrames(playersGames.get(j));

        }
    }

    void getTurn(PlayerGame game, int iteration) {
        setThrow(game, " enter your first throw : ");
        setSecondThrow(game, iteration);
        if (game.getFrames().get(iteration).isLastFrame() && game.getFrames().get(iteration)
                .isSpare()) {
            setThrow(game, " enter your third throw : ");
        }
        if (game.getFrames().get(iteration).isLastFrame() && game.getFrames().get(iteration)
                .isStrike()) {
            setThrow(game, " enter your second throw : ");
            setThrow(game, " enter your third throw : ");
        }
    }

    private void setSecondThrow(PlayerGame game, int iteration) {
        if (!game.getFrames().get(iteration).isStrike()) {
            gameService.wurfelnAccept(
                    getSecondThrow(game, iteration, game.getFrames().get(iteration).getThrow(0)),
                    game
            );

        }
    }

    private void setThrow(PlayerGame game, String s) {
        gameService.wurfelnAccept(getValidNumber(game.getPlayerName() + s, 0, 10),
                game);
    }

    private int getSecondThrow(PlayerGame game, int iteration, int throwResult) {
        boolean valid = false;
        while (!valid) {
            throwResult = getValidNumber(
                    game.getPlayerName() + " enter your second throw : ", 0, 10);
            valid = ((throwResult + game.getFrames().get(iteration).getThrow(0)) <= 10);
        }
        return throwResult;
    }

}


