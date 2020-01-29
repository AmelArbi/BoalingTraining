package com.valtech.amel.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BowlingApp {

    Scanner myScanner = new Scanner(System.in);
    List<GameController> playersGames = new ArrayList<>(6);

    public static void main(String[] args) {
        BowlingApp bowlingApp = new BowlingApp();
        System.out.println(" ------------------------Game Start-----------------------------");
        GameController gameController = new GameController();
        int numberOfPlayers = bowlingApp.getValidNumber("Please Enter the number of Players : ", 2, 6);
        for (int i = 0; i < numberOfPlayers; i++) {
            bowlingApp.playersGames.add(new GameController());
            System.out.println("Please enter the name of the player number " + (i + 1) + " : ");
            bowlingApp.playersGames.get(i).game.setPlayerName(bowlingApp.myScanner.nextLine());
        }
        gameController.game.setPlayerName("Alex");
        for (int i = 0; i < 10; i++) {
            System.out.println(" ------------------------Iteration " + (i + 1) + "----------------------------");
            for (int j = 0; j < numberOfPlayers; j++) {
                bowlingApp.getTurn(bowlingApp.playersGames.get(j), i);
                System.out.println();
                System.out.println("Score table of " + bowlingApp.playersGames.get(j).game.getPlayerName());
                bowlingApp.playersGames.get(j).gameView.showFrames(bowlingApp.playersGames.get(j));

            }

        }

    }

    void getTurn(GameController gameControllerPlayerGame, int iteration) {
        int throwResult;
        throwResult =
                getValidNumber(gameControllerPlayerGame.game.getPlayerName() + " enter your first throw : ", 0, 10);
        gameControllerPlayerGame.wurfelnAccept(throwResult);
        if (!gameControllerPlayerGame.getFrame(iteration).isStrike()) {
            throwResult = getNextThrow(gameControllerPlayerGame, iteration, throwResult);
            gameControllerPlayerGame.wurfelnAccept(throwResult);

        }

        if (gameControllerPlayerGame.getFrame(iteration).isLastFrame() && gameControllerPlayerGame.getFrame(iteration)
                .isSpare()) {
            throwResult = getValidNumber(
                    gameControllerPlayerGame.game.getPlayerName() + " enter your third throw : ", 0, 10);
            gameControllerPlayerGame.wurfelnAccept(throwResult);

        }

        if (gameControllerPlayerGame.getFrame(iteration).isLastFrame() && gameControllerPlayerGame.getFrame(iteration)
                .isStrike()) {
            throwResult = getValidNumber(
                    gameControllerPlayerGame.game.getPlayerName() + " enter your second throw : ", 0, 10);
            gameControllerPlayerGame.wurfelnAccept(throwResult);
            throwResult = getValidNumber(
                    gameControllerPlayerGame.game.getPlayerName() + " enter your third throw : ", 0, 10);
            gameControllerPlayerGame.wurfelnAccept(throwResult);

        }
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

    private int getNextThrow(GameController gameControllerPlayerGame, int iteration, int throwResult) {
        boolean valid = false;
        while (!valid) {
            throwResult = getValidNumber(
                    gameControllerPlayerGame.game.getPlayerName() + " enter your second throw : ", 0, 10);

            valid = ((throwResult + gameControllerPlayerGame.getFrame(iteration).getThrow(0)) <= 10);

        }
        return throwResult;
    }

}


