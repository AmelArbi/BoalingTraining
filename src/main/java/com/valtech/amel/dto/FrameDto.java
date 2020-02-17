package com.valtech.amel.dto;

import java.util.ArrayList;
import java.util.List;

public class FrameDto {

    //throwslist
    private  List<Integer> throwList= new ArrayList<>(3);

    //score
    private final int score;

    public FrameDto(List<Integer> throwList, int score) {
        this.throwList = throwList;
        this.score = score;
    }

    public List<Integer> getThrowList() {
        return throwList;
    }


    public int getScore() {
        return score;
    }

}
