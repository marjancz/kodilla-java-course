package com.kodilla.rps;

import java.util.Scanner;

public class GameMode {
    public String gameMode() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose the game mode:" +
                "\n(1) normal" +
                "\n(2) extended");
        String mode = scanner.next();
        boolean end = false;
        while (!end) {
            if (!mode.equals("1") && !mode.equals("2")) {
                System.out.println("Wrong! Please choose the game mode:" +
                        "\n(1) normal" +
                        "\n(2) extended");
                mode = scanner.next();
            } else {
                end = true;

            }
        }
        return mode;
    }
}