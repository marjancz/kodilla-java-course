package com.kodilla.rps.players;

import com.kodilla.rps.figures.FigureNames;

import java.util.Random;

public class ComputerMove {
    private String compMove;
    Random random = new Random();
    FigureNames figureNames = new FigureNames();

    public String getCompMoveNormal() {
        compMove = figureNames.getFigureListNormal().get(random.nextInt(2)+1);
        return compMove;
    }

    public String getCompMoveExtended() {
        compMove = figureNames.getFigureListExtended().get(random.nextInt(4)+1);
        return compMove;
    }

    @Override
    public String toString() {
        return compMove;
    }
}
