package com.valtech.amel.dto;

import java.util.List;

public class GameDto {
    //iteration
    private final int turn;

    //frames
    private final List<FrameDto> frames;

    //PlayerName
    private final String playerName;

    public GameDto(int turn, List<FrameDto> frames, String playerName) {
        this.turn = turn;
        this.frames = frames;
        this.playerName = playerName;
    }

    public int getTurn() {
        return turn;
    }



    public List<FrameDto> getFrames() {
        return this.frames;
    }


    public String getPlayerName() {
        return playerName;
    }

}





