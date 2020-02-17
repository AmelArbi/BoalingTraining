package com.valtech.amel.dto;

import java.util.List;
import com.valtech.amel.model.Frame;
import com.valtech.amel.model.Game;

public class GameDto {
    //iteration
    private int turn;

    //frames
    private List<Frame> frames;//List<Frame>  oder List<FrameDto> !!!!!!!!!!!!????????

    //PlayerName
    private String playerName;

    private Game game;

    public void setFrames(List<Frame> frames) {
        this.frames = frames;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameDto(Game game) {
        this.game = game;
        this.turn = game.getIteration();
        this.frames = game.getFrames();
        this.playerName = game.getPlayerName();
    }



    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        game.setIteration(turn);
        this.turn = turn;
    }

    public List<Frame> getFrames() {
        return this.frames;
    }

    // seTFrame gibt nicht im Game => setFrame nur durch wuerfelaccept
/*    public void setFrames(List<Frame> frames) {
        game.
        this.frames = frames;
    }*/

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        game.setPlayerName(playerName);
        this.playerName = playerName;
    }
}





