package com.valtech.amel.Controller;

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

    public Frame getFrame(int Iteration) {
        return game.getFrames().get(Iteration);

    }

    public void wurfelnAccept(int zahl) {
        if (game.getFrames().size() == iteration) {
            wuerfelnAcceptNewFrame(zahl);
        } else {
            wuerfelnAcceptExistingFrame(zahl);
        }
    }

    private void wuerfelnAcceptNewFrame(int zahl) {
        Frame frame = new Frame(iteration);
        frame.addThrow(zahl);
        game.getFrames().add(frame);

        if (frame.isComplete()) {
            addBonus(iteration);
            iteration++;
        }

    }

    private void wuerfelnAcceptExistingFrame(int zahl) {
        Frame currentFrame = game.getFrames().get(iteration);
        currentFrame.addThrow(zahl);

        if (currentFrame.isComplete()) {
            addBonus(iteration);
            iteration++;
            System.out.println("iteration im Wuerfel :" + iteration + " Frame Number" + currentFrame.getNumber());
        }

    }

/*    private void AddBonus(int zahl, Frame currentFrame) {
        if (getFrame(iteration - 1).getBonusCount() > 0) {
            getFrame(iteration - 1).addBonus(zahl);

        }
        if (getFrame(iteration - 2).getBonusCount() > 0) {
            getFrame(iteration - 2).addBonus(zahl);

        }

    }*/

    public void addBonus(int iteration) {
        Frame currentFrame = game.getFrames().get(iteration);

        if (currentFrame.getNumber() > 0) {
            Frame prevFrame = game.getFrames().get(iteration - 1);

            if (currentFrame.getNumber() < 9) {

                addBonusBeforeLastFrame(iteration, currentFrame, prevFrame);

            } else if (currentFrame.getNumber() == 9) {
                addBonusLastFrame(iteration, currentFrame, prevFrame);

            }

        }

    }

    private void addBonusLastFrame(int iteration, Frame currentFrame, Frame prevFrame) {
        Frame prePrevFrame = game.getFrames().get(currentFrame.getNumber() - 2);
        System.out.println("iteration im Addbonus" + iteration + " number Frame : " + currentFrame.getNumber());

        if (prePrevFrame.isStrike() && prevFrame.isStrike()) {

            prePrevFrame.addBonus(currentFrame.getThrow(0));

        }

        if (prevFrame.isSpare()) {
            prevFrame.addBonus(currentFrame.getThrow(0));
        } else if ((prevFrame.isStrike())) {
            prevFrame.addBonus(currentFrame.getThrow(0));
            prevFrame.addBonus(currentFrame.getThrow(1));

        }

/*            if (prePrevFrame.isStrike() && prevFrame.isStrike()) {
                if (!currentFrame.isSpare() && !currentFrame.isStrike()) {
                    prePrevFrame.addBonus(currentFrame.getThrow(0));

                } else if ((currentFrame.isStrike() && (currentFrame.getNumberOfThrows() == 1))) {
                    prePrevFrame.addBonus(currentFrame.getThrow(0));

                } else if (currentFrame.isSpare() && currentFrame.getNumberOfThrows() == 2) {
                    prePrevFrame.addBonus(currentFrame.getThrow(0));

                }

            }

            if (prevFrame.isSpare()) {
                prevFrame.addBonus(currentFrame.getThrow(0));
            } else if ((prevFrame.isStrike())) {
                prevFrame.addBonus(currentFrame.getThrow(0));
                if (currentFrame.getNumberOfThrows() == 2) {
                    prevFrame.addBonus(currentFrame.getThrow(1));
                }
            }*/

    }

    private void addBonusBeforeLastFrame(int iteration, Frame currentFrame, Frame prevFrame) {
        if (iteration >= 2) {
            Frame prePrevFrame = game.getFrames().get(iteration - 2);

            if (prePrevFrame.isStrike() && prevFrame.isStrike()) {
                prePrevFrame.addBonus(currentFrame.getThrow(0));
            }

        }
        //if(currentFrame.isComplete()){
        if (prevFrame.isSpare()) {
            prevFrame.addBonus(currentFrame.getThrow(0));
        } else if ((prevFrame.isStrike())) {
            prevFrame.addBonus(currentFrame.getThrow(0));
            if (!currentFrame.isStrike()) {
                prevFrame.addBonus(currentFrame.getThrow(1));
            }
        }

        // }

    }

    public int calculateScore() {
        //return calculateScoreForward(iteration - 1);
        //return calculateFrameScore(iteration);
        //return calculateScore(iteration - 1);
        return calculateScoreWithFullScore(iteration);

    }

    public int calculateFrameScore(int iteration) {
        if (getFrame(iteration).isStrike()) {
            getFrame(iteration).incrementBonusCount(2);

        } else if (getFrame(iteration).isSpare()) {
            getFrame(iteration).incrementBonusCount(1);

        }
        int sum = 0;
        for (int i = 0; i < iteration; i++) {
            sum += game.getFrames().get(i).getFinalScore();
        }
        return sum;
    }

    public int calculateScoreWithFullScore(int iteration) {
        int sum = 0;
        for (int i = 0; i < iteration; i++) {
            sum += game.getFrames().get(i).getFinalScore();
        }
        return sum;
    }

    public int calculateScoreForward(int iteration) {
        int sum = 0;
        int index = 0;
        int[] factor = new int[24];

        for (int i = 0; i < iteration + 1; i++) {
            Frame frame = game.getFrames().get(i);
            for (int j = 0; j < frame.getNumberOfThrows(); j++) {
                index++;
                sum = sum + frame.getThrow(j) * (factor[index] + 1);
            }
            if (frame.isStrike()) {
                factor[index + 1]++;
                factor[index + 2]++;
            } else if (frame.isSpare()) {
                factor[index + 1]++;
            }
        }
        return sum;
    }

    public int calculateScore(int iteration) {
        Frame currentFrame = game.getFrames().get(iteration);
        int bonus = getBonus(iteration);

        int sum = currentFrame.getScore();
        if (iteration > 0)
            sum = sum + calculateScore(iteration - 1);
        sum = sum + bonus;

        return sum;
    }

    public int getBonus(int iteration) {
        Frame currentFrame = game.getFrames().get(iteration);
        int bonus = 0;
        if (iteration > 0) {
            Frame prevFrame = game.getFrames().get(iteration - 1);

            if (prevFrame.isSpare()) {
                bonus = bonus + currentFrame.getThrow(0);
            } else if ((prevFrame.isStrike())) {
                bonus = bonus + currentFrame.getThrow(0);
                if (!currentFrame.isStrike()) {
                    bonus = bonus + currentFrame.getThrow(1);
                }
            }

            if (iteration >= 2) {
                Frame prePrevFrame = game.getFrames().get(iteration - 2);

                if (prePrevFrame.isStrike() && prevFrame.isStrike()) {
                    bonus = bonus + currentFrame.getThrow(0);
                }
            }

            if (iteration == 9 && prevFrame.isStrike() && !currentFrame.isSpare()) {
                bonus = bonus + currentFrame.getThrow(1);
            }
        }

        return bonus;
    }

}
