package com.kodilla.rps.games;

import com.kodilla.rps.exceptions.NullPointerException;
import com.kodilla.rps.figures.Figure;

public class GameResultChecker {
    Figure figure;
    String computerMove;

    public static int checkGames(Figure figure, String computerMove) throws NullPointerException {
        if (figure != null) {
            boolean isWin = figure.getWinWith().contains(computerMove);
            boolean isTie = figure.getName().equals(computerMove);

            if (isWin) {
                return 1;
            } else if (isTie) {
                return 0;
            } else {
                return -1;
            }
        }
        throw new NullPointerException("End");
    }
}
