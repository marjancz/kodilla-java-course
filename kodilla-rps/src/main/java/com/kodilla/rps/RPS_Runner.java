package com.kodilla.rps;

public class RPS_Runner {
    public static void main(String[] args) {
        User user = new User();
        GameMode gameMode = new GameMode();
        NormalGame normalGame = new NormalGame();
        normalGame.runner();
//        String name = user.getName();
//        String mode = gameMode.gameMode();
    }
}
