package com.valtech.amel.dto;

import java.util.List;
import com.valtech.amel.model.Frame;

public class FrameDto {

    //throwslist
    private List<Integer> throwList;

    //score
    private int score;

    private Frame frame;

    public FrameDto(Frame frame) {
        this.frame = frame;
    }

    public List<Integer> getThrowList() {
        this.throwList = frame.getThrowList();
        return throwList;
    }

    //gibt nicht im Frame
/*    public void setThrowList(List<Integer> throwList) {
        this.throwList = throwList;
    }*/

    public int getScore() {
        this.score=frame.getFinalScore();
        return score;
    }

/*    public void setScore(int score) {

    }*/
}
