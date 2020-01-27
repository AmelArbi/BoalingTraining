package com.valtech.amel.Controller;

import java.util.Scanner;

public class BowlingApp {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BowlingApp bowlingApp = new BowlingApp();

        System.out.println(" ------------------------Game Start-----------------------------");
        GameController gameController = new GameController();
        gameController.game.setNumber(1);
        gameController.game.setPlayerName("Alex");

        for (int i = 0; i < 10; i++) {
            System.out.println(" ------------------------Iteration " + (i + 1) + "----------------------------");
            bowlingApp.getTurn(gameController, i);
            gameController.gameView.showFrames(gameController);
        }

    }

    void getTurn(GameController gameControllerPlayerGame, int iteration) {
        int throwResult;
        throwResult =
                getThrow(gameControllerPlayerGame.game.getPlayerName() + " enter your first throw : ");
        gameControllerPlayerGame.wurfelnAccept(throwResult);
        if (!gameControllerPlayerGame.getFrame(iteration).isStrike()) {
            throwResult = getNextThrow(gameControllerPlayerGame, iteration, throwResult);
            gameControllerPlayerGame.wurfelnAccept(throwResult);

        }

        if (gameControllerPlayerGame.getFrame(iteration).isLastFrame() && gameControllerPlayerGame.getFrame(iteration)
                .isSpare()) {
            throwResult = getThrow(
                    gameControllerPlayerGame.game.getPlayerName() + " enter your third throw : ");
            gameControllerPlayerGame.wurfelnAccept(throwResult);

        }

        if (gameControllerPlayerGame.getFrame(iteration).isLastFrame() && gameControllerPlayerGame.getFrame(iteration)
                .isStrike()) {
            throwResult = getThrow(
                    gameControllerPlayerGame.game.getPlayerName() + " enter your second throw : ");
            gameControllerPlayerGame.wurfelnAccept(throwResult);
            throwResult = getThrow(
                    gameControllerPlayerGame.game.getPlayerName() + " enter your third throw : ");
            gameControllerPlayerGame.wurfelnAccept(throwResult);

        }
    }

    private int getNextThrow(GameController gameControllerPlayerGame, int iteration, int throwResult) {
        boolean valid = false;
        while (!valid) {
            throwResult = getThrow(
                    gameControllerPlayerGame.game.getPlayerName() + " enter your second throw : ");

            valid = ((throwResult + gameControllerPlayerGame.getFrame(iteration).getThrow(0)) <= 10);

        }
        return throwResult;
    }

    int getThrow(String message) {
        boolean valid = false;
        int zahl = 0;
        while (!valid) {
            System.out.print(message);
            try {
                zahl = Integer.parseInt(scanner.nextLine());
                if (zahl >= 0 && zahl <= 10)
                    valid = true;
            } catch (NumberFormatException e) {
                System.out.println("please enter a valid number !");

            }
        }
        return zahl;
    }

    /*int getNumberOfPlayer(String message) {
        boolean valid = false;1
        int zahl = 0;
        while (!valid) {
            System.out.println(message);
            try {
                zahl = Integer.parseInt(myObj.nextLine());
                if (zahl >= 0 && zahl <= 4)
                    valid = true;
            } catch (NumberFormatException e) {
                System.out.println("please enter a valid number !");

            }
        }
        return zahl;
    }*/

/*    private String getString(String message) {
        //Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println(message);
        return myObj.nextLine();
    }*/

/*    private void setPlayers() {//do you want to add more yes or no

        List<Player> players = new ArrayList<>();
        String Name;
        int numberOfPlayer = getNumberOfPlayer("Enter the Number of Players : ");

        for (int i = 0; i < numberOfPlayer; i++) {
            Name = getString("Enter name of player number : " + (i + 1) + " : ");
            players.add(new Player(Name));
        }
        gameController.game.setPlayers(players);
    }*/

}


