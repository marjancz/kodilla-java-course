package com.kodilla.rps;

import com.kodilla.rps.exceptions.NullPointerException;
import com.kodilla.rps.games.Game;

public class RPS_Runner {
    public static void main(String[] args) {
        Game game = new Game();
        try {
            game.runGame();
        } catch (NullPointerException e) {
            System.out.println("End of game");
        }
    }
}
