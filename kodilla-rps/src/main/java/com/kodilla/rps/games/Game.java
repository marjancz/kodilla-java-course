package com.kodilla.rps.games;

import com.kodilla.rps.exceptions.NullPointerException;
import com.kodilla.rps.gameConfig.GameMode;
import com.kodilla.rps.gameConfig.User;

public class Game {
    User user = new User();
    GameMode gameMode = new GameMode();
    NormalGame normalGame = new NormalGame();
    ExtendedGame extendedGame = new ExtendedGame();

    public void runGame() throws NullPointerException {
        System.out.println(user.getName() + " *** Welcome to the \"Rock, Paper, scissors Game\"");
        String mode = gameMode.getGameMode();
        if (mode != null) {
            if (mode.equals("1")) {
                normalGame.runner();
            } else {
                extendedGame.runner();
            }
        }
        throw new NullPointerException("end");
    }
}
