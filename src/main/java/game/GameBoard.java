package game;

import java.util.List;
import java.util.Scanner;

public class GameBoard {

    private boolean end = false;
    private int[] points = {0, 0};
    private final Scanner scanner = new Scanner(System.in);

    public Pair intro() {
        System.out.println("What's your name?");
        String name = scanner.nextLine();

        System.out.println("How many rounds will you play?");
        int rounds = scanner.nextInt();
        System.out.println("Keyboard input: 1 - paper, 2 - rock, 3 - scissors, n/N - new game, a/A - exit");

        return new Pair(name, rounds);

    }

    public boolean play(String name, int rounds) {

        GameDumbLogic as = new GameDumbLogic(rounds);
        List<String> computerMoves = as.randomized();
        String move;
        boolean restart = false;
        scanner.nextLine();


        while (!end) {

            System.out.println("\nPick your move:");
            move = scanner.nextLine();

            switch (move) {
                case "x", "X" -> {
                    System.out.println("Do you really want to exit? Enter 'yes' to confirm.");
                    move = scanner.nextLine();
                    if (move.equals("yes") || move.equals("YES")) {
                        System.out.println("Score " + points[0] + ":" + points[1]);
                        end = true;
                    }
                }
                case "n", "N" -> {
                    System.out.println("Do you really want to restart your game? You'll lose all your progress. Enter 'yes' to confirm.");
                    move = scanner.nextLine();
                    if (move.equals("yes") || move.equals("YES")) {
                        System.out.println("Restarting the game...");
                        end = true;
                        restart = true;
                    }
                }
                case "1", "2", "3" -> {
                    System.out.println("Jan Ken Pon!");
                    System.out.println(name + ": " + as.displayMoveName(move) + "   Computer: " + as.displayMoveName(computerMoves.get(as.getRounds() - 1)));
                    points = as.calculatePoints(move, computerMoves.get(as.getRounds() - 1), points);
                    System.out.println("Score " + points[0] + ":" + points[1]);
                }
                default ->
                        System.out.println("Wrong input! Keyboard input: 1 - paper, 2 - rock, 3 - scissors, n/N - new game, a/A - exit");
            }

            if (as.getRounds() == 0) {
                end = true;
            }
        }

        System.out.println("Thanks for playing!\n");

        return restart;

    }


}
