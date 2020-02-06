package com.valtech.amel.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BowlingApp {

    Scanner myScanner = new Scanner(System.in);
    List<GameController> playersGames = new ArrayList<>(6);

    public static void main(String[] args) {
        BowlingApp bowlingApp = new BowlingApp();
        bowlingApp.startGame();

    }

    private  void startGame() {
        System.out.println(" ------------------------Game Start-----------------------------");
        int numberOfPlayers = getValidNumber("Please Enter the number of Players : ", 2, 6);
        setGames(numberOfPlayers);

        for (int iteration = 0; iteration < 10; iteration++) {
            System.out.println(" ------------------------Iteration " + (iteration + 1) + "----------------------------");
            spielen(numberOfPlayers, iteration);

        }
    }

    private void spielen(int numberOfPlayers, int iteration) {
        for (int j = 0; j < numberOfPlayers; j++) {
            getTurn(playersGames.get(j), iteration);
            System.out.println();
            System.out.println("Score table of " + playersGames.get(j).getGame().getPlayerName());
            playersGames.get(j).getGameView().showFrames(playersGames.get(j));

        }
    }

    private void setGames(int numberOfPlayers) {
        for (int i = 0; i < numberOfPlayers; i++) {
            playersGames.add(new GameController());
            System.out.println("Please enter the name of the player number " + (i + 1) + " : ");
            playersGames.get(i).getGame().setPlayerName(myScanner.nextLine());
        }
    }

    void getTurn(GameController gameControllerPlayerGame, int iteration) {
        int throwResult;
        throwResult =
                getValidNumber(gameControllerPlayerGame.getGame().getPlayerName() + " enter your first throw : ", 0, 10);
        gameControllerPlayerGame.wurfelnAccept(throwResult);
        if (!gameControllerPlayerGame.getFrame(iteration).isStrike()) {
            throwResult = getNextThrow(gameControllerPlayerGame, iteration, throwResult);
            gameControllerPlayerGame.wurfelnAccept(throwResult);

        }

        if (gameControllerPlayerGame.getFrame(iteration).isLastFrame() && gameControllerPlayerGame.getFrame(iteration)
                .isSpare()) {
            throwResult = getValidNumber(
                    gameControllerPlayerGame.getGame().getPlayerName() + " enter your third throw : ", 0, 10);
            gameControllerPlayerGame.wurfelnAccept(throwResult);

        }

        if (gameControllerPlayerGame.getFrame(iteration).isLastFrame() && gameControllerPlayerGame.getFrame(iteration)
                .isStrike()) {
            throwResult = getValidNumber(
                    gameControllerPlayerGame.getGame().getPlayerName() + " enter your second throw : ", 0, 10);
            gameControllerPlayerGame.wurfelnAccept(throwResult);
            throwResult = getValidNumber(
                    gameControllerPlayerGame.getGame().getPlayerName() + " enter your third throw : ", 0, 10);
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
                    gameControllerPlayerGame.getGame().getPlayerName() + " enter your second throw : ", 0, 10);

            valid = ((throwResult + gameControllerPlayerGame.getFrame(iteration).getThrow(0)) <= 10);

        }
        return throwResult;
    }

}


