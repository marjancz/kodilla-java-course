package com.kodilla.rps.games;

import com.kodilla.rps.exceptions.NullPointerException;
import com.kodilla.rps.figures.Figure;
import com.kodilla.rps.players.ComputerMove;
import com.kodilla.rps.players.PlayerMoveExtended;

import java.util.Scanner;

public class ExtendedGame {
    int win = 0, loss = 0, tie = 0;
    Scanner sc = new Scanner(System.in);
    PlayerMoveExtended plMove = new PlayerMoveExtended();
    ComputerMove computerMove = new ComputerMove();
    private boolean end = false;

    public void runner() throws NullPointerException {
        System.out.println("Please type how many won rounds you want to play:");
        int countWin = sc.nextInt();
        if (countWin < 1) {
            System.out.println("Please type at least 1 round");
            runner();
        } else {
            while (!end) {
                Figure playerMove = plMove.getPlayerMove();
                String compMove = computerMove.getCompMoveExtended();
                if (playerMove != null) {
                    int result = GameResultChecker.checkGames(playerMove, compMove);
                    switch (result) {
                        case 1:
                            win++;
                            System.out.println("Your choice is: " + playerMove.toString() +
                                    "\nComputer chose: " + compMove.toString() +
                                    "\nResult: " + playerMove.toString() + " beats " + compMove + ". You win!!!" +
                                    "\nYou have " + win + " wins and " + loss + " losses");
                            break;
                        case 0:
                            tie++;
                            System.out.println("Your choice is: " + playerMove.toString() +
                                    "\nComputer chose: " + compMove.toString() +
                                    "\nResult: It's a tie" +
                                    "\nYou have " + win + " wins and " + loss + " losses");
                            break;
                        case -1:
                            loss++;
                            System.out.println("Your choice is: " + playerMove.toString() +
                                    "\nComputer chose: " + compMove.toString() +
                                    "\nResult: " + compMove + " beats " + playerMove.toString() + ". You lost!!!" +
                                    "\nYou have " + win + " wins and " + loss + " losses");
                            break;
                        default:
                            break;
                    }
                    if (win == countWin) {
                        end = true;
                        System.out.println("You have " + win + " wins. You've won the game!!! :)");
                    }
                    if (loss == countWin) {
                        end = true;
                        System.out.println("Comp has " + loss + " wins. You've lost the game :(");
                    }
                }
                //throw new NullPointerException("end");
            }
        }
    }
}
