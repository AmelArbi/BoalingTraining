package com.valtech.amel.service;

import com.valtech.amel.model.Frame;
import com.valtech.amel.model.PlayerGame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    static final Logger logger = LoggerFactory.getLogger(GameService.class);

    public GameService() {
        logger.info("Initializing");
    }

    public void wurfelnAccept(int zahl, PlayerGame game) {
        if (game.getIteration() <= 9) {
            if (game.getFrames().size() == game.getIteration()) {
                wuerfelnAcceptNewFrame(zahl,game);
            } else {
                wuerfelnAcceptExistingFrame(zahl, game);
            }
        }
    }

    private void wuerfelnAcceptNewFrame(int zahl, PlayerGame game) {
        Frame frame = new Frame(game.getIteration());
        frame.addThrow(zahl);
        game.getFrames().add(frame);

        if (frame.isComplete()) {
            addBonus(game);
            game.setIteration(game.getIteration() + 1);
        }
    }

    private void wuerfelnAcceptExistingFrame(int zahl, PlayerGame game) {
        Frame currentFrame = game.getFrames().get(game.getIteration());
        currentFrame.addThrow(zahl);

        if (currentFrame.isComplete()) {
            addBonus(game);
            game.setIteration(game.getIteration() + 1);
        }
    }

    public void addBonus(PlayerGame game) {
        Frame currentFrame = game.getFrames().get(game.getIteration());
        if (game.getIteration() > 0) {
            Frame prevFrame = game.getFrames().get(game.getIteration() - 1);
            addBonus(game, currentFrame, prevFrame);
        }
    }

    private void addBonus(PlayerGame game, Frame currentFrame, Frame prevFrame) {
        if (game.getIteration() >= 2) {
            Frame prePrevFrame = game.getFrames().get(game.getIteration() - 2);
            if (prePrevFrame.isStrike() && prevFrame.isStrike()) {
                prePrevFrame.addBonus(currentFrame.getThrow(0));
            }
        }
        if (prevFrame.isSpare()) {
            prevFrame.addBonus(currentFrame.getThrow(0));
        } else if ((prevFrame.isStrike())) {
            prevFrame.addBonus(currentFrame.getThrow(0));
            if (game.getIteration() < 9) {

                if (!currentFrame.isStrike()) {
                    prevFrame.addBonus(currentFrame.getThrow(1));
                }
            } else if (game.getIteration() == 9) {
                prevFrame.addBonus(currentFrame.getThrow(1));

            }
        }
    }

    public int calculateScore(PlayerGame game, int iteration) {
        int sum = 0;
        for (int i = 0; i < iteration; i++) {
            sum += game.getFrames().get(i).getFinalScore();
        }
        return sum;

    }

}
