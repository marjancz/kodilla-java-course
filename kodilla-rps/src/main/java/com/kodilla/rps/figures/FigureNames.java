package com.kodilla.rps.figures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class FigureNames {
    public static final String SCISSORS = "Scissors";
    public static final String ROCK = "Rock";
    public static final String PAPER = "Paper";
    public static final String LIZARD = "Lizard";
    public static final String SPOCK = "Spock";

    static List<String> figureListNorm = new ArrayList<>();
    static List<String> figureListExtend = new ArrayList<>();
    static List<String> scissorsWinWith = new ArrayList<>();
    static List<String> rockWinWith = new ArrayList<>();
    static List<String> paperWinWith = new ArrayList<>();
    static List<String> lizardWinWith = new ArrayList<>();
    static List<String> spockWinWith = new ArrayList<>();

    public static List<String> getFigureListNormal() {
        figureListNorm = Arrays.asList(SCISSORS, ROCK, PAPER);
        return figureListNorm;
    }

    public static List<String> getFigureListExtended() {
        figureListExtend = Arrays.asList(SCISSORS, ROCK, PAPER, LIZARD, SPOCK);
        return figureListExtend;
    }

    public static List<String> scissorsWinWith() {
        scissorsWinWith = Arrays.asList(PAPER, LIZARD);
        return scissorsWinWith;
    }

    public static List<String> rockWinWith() {
        rockWinWith = Arrays.asList(SCISSORS, LIZARD);
        return rockWinWith;
    }

    public static List<String> paperWinWith() {
        paperWinWith = Arrays.asList(ROCK, SPOCK);
        return paperWinWith;
    }

    public static List<String> lizardWinWith() {
        lizardWinWith = Arrays.asList(PAPER, SPOCK);
        return lizardWinWith;
    }

    public static List<String> spockWinWith() {
        spockWinWith = Arrays.asList(ROCK, SCISSORS);
        return spockWinWith;
    }
}
