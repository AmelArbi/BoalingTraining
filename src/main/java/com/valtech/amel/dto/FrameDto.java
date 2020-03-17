package com.valtech.amel.dto;

import java.util.List;

public class FrameDto {


    private  List<Integer> throwList;

    private final int score;

    public FrameDto(List<Integer> throwList, int score) {
        this.throwList = throwList;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public List<Integer> getThrowList() {
        return throwList;
    }
}
