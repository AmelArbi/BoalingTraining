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
            playersGames.add(new GameController());
            System.out.println("Please enter the name of the player number " + (i + 1) + " : ");
            playersGames.get(i).getGame().setPlayerName(myScanner.nextLine());
        }
    }

    private void playGame(int numberOfPlayers) {
        System.out.println(" ------------------------Game Start-----------------------------");
        for (int iteration = 0; iteration < 10; iteration++) {
            playIteration(numberOfPlayers, iteration);
        }
    }

    private void playIteration(int numberOfPlayers, int iteration) {
        System.out.println(" ------------------------Iteration " + (iteration + 1) + "----------------------------");
        for (int j = 0; j < numberOfPlayers; j++) {
            getTurn(playersGames.get(j), iteration);
            System.out.println();
            System.out.println("Score table of " + playersGames.get(j).getGame().getPlayerName());
            playersGames.get(j).getGameView().showFrames(playersGames.get(j));

        }
    }

    void getTurn(GameController playerGame, int iteration) {
        setThrow(playerGame, " enter your first throw : ");
        setSecondThrow(playerGame, iteration);
        if (playerGame.getFrame(iteration).isLastFrame() && playerGame.getFrame(iteration)
                .isSpare()) {
            setThrow(playerGame, " enter your third throw : ");
        }
        if (playerGame.getFrame(iteration).isLastFrame() && playerGame.getFrame(iteration)
                .isStrike()) {
            setThrow(playerGame, " enter your second throw : ");
            setThrow(playerGame, " enter your third throw : ");
        }
    }

    private void setSecondThrow(GameController gameControllerPlayerGame, int iteration) {
        if (!gameControllerPlayerGame.getFrame(iteration).isStrike()) {
            gameControllerPlayerGame.wurfelnAccept(
                    getSecondThrow(gameControllerPlayerGame,
                            iteration,
                            gameControllerPlayerGame.getFrame(iteration).getThrow(0)
                    )
            );

        }
    }

    private void setThrow(GameController gameControllerPlayerGame, String s) {
        gameControllerPlayerGame.wurfelnAccept(
                getValidNumber(gameControllerPlayerGame.getGame().getPlayerName() + s,
                        0,
                        10)
        );
    }

    private int getSecondThrow(GameController gameControllerPlayerGame, int iteration, int throwResult) {
        boolean valid = false;
        while (!valid) {
            throwResult = getValidNumber(
                    gameControllerPlayerGame.getGame().getPlayerName() + " enter your second throw : ", 0, 10);

            valid = ((throwResult + gameControllerPlayerGame.getFrame(iteration).getThrow(0)) <= 10);

        }
        return throwResult;
    }

}


