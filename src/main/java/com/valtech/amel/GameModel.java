package com.valtech.amel;

import java.util.ArrayList;
import java.util.List;

public class GameModel {
    List<Frame> frames = new ArrayList<>(10);
    void printframes() {
        frames.forEach(System.out::println);
    }
}