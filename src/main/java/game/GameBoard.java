package game;

import java.util.List;
import java.util.Scanner;

public class GameBoard {

    private boolean end = false;
    private int[] points = {0, 0};
    private final Scanner scanner = new Scanner(System.in);

    public GameConfiguration intro() {
        System.out.println("What's your name?");
        String name = scanner.nextLine();

        System.out.println("How many rounds will you play?");
        int rounds = scanner.nextInt();
        System.out.println("Keyboard input: 1 - paper, 2 - rock, 3 - scissors, n/N - new game, a/A - exit");

        return new GameConfiguration(name, rounds);

    }

    public boolean play(String name, int rounds) {

        GameLogic gameLogic = new GameLogic(rounds);
        List<Move> computerMoves = gameLogic.randomized();
        MoveConverter converter = new MoveConverter();
        String moveInput;
        boolean restart = false;
        scanner.nextLine();


        while (!end) {

            System.out.println("\nPick your move:");
            moveInput = scanner.nextLine();

            switch (moveInput) {
                case "x", "X" -> {
                    exitCheck();
                }

                case "n", "N" -> {
                    restart = restartCheck();
                }
                case "1", "2", "3" -> {
                    gameplay(name, moveInput, converter, computerMoves, gameLogic);
                }
                default ->
                        System.out.println("Wrong input! Keyboard input: 1 - paper, 2 - rock, 3 - scissors, n/N - new game, a/A - exit");
            }

            if (gameLogic.getRounds() == 0) {
                end = true;
            }
        }

        System.out.println("Thanks for playing!\n");

        return restart;

    }

    public void exitCheck() {
        System.out.println("Do you really want to exit? Enter 'yes' to confirm.");
        String moveInput = scanner.nextLine();
        if (moveInput.equals("yes") || moveInput.equals("YES")) {
            System.out.println("Score " + points[0] + ":" + points[1]);
            end = true;
        }
    }

    public boolean restartCheck() {
        System.out.println("Do you really want to restart your game? You'll lose all your progress. Enter 'yes' to confirm.");
        String moveInput = scanner.nextLine();
        if (moveInput.equals("yes") || moveInput.equals("YES")) {
            System.out.println("Restarting the game...");
            end = true;
        }

        return end;
    }

    public void gameplay(String name, String moveInput, MoveConverter converter, List<Move> computerMoves, GameLogic gameLogic) {
        Move move = converter.convert(moveInput);
        System.out.println("Jan Ken Pon!");
        System.out.println(name + ": " + move.getName() + "   Computer: " + computerMoves.get(gameLogic.getRounds() - 1).getName());
        points = gameLogic.calculatePoints(move, computerMoves.get(gameLogic.getRounds() - 1), points);
        System.out.println("Score " + points[0] + ":" + points[1]);
    }

}
