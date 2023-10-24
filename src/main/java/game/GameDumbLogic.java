package game;

import java.util.*;

public class GameDumbLogic {

    private int rounds;

    public GameDumbLogic(int rounds) {
        this.rounds = rounds;
    }

    public List<String> randomized() {
        List<String> moves = new ArrayList<>();
        Random generator = new Random();

        for (int i = 0; i < rounds; i++) {

            moves.add(String.valueOf(generator.nextInt(3) + 1));
        }

        return moves;

    }

    public int[] calculatePoints(String playerMove, String computerMove, int[] points) {

        if (playerMove.equals(computerMove)) {
            points[0]++;
            points[1]++;
            rounds--;

        } else if (playerMove.equals("1") && computerMove.equals("2") || playerMove.equals("2") && computerMove.equals("3") || playerMove.equals("3") && computerMove.equals("1")) {
            points[0]++;
            rounds--;
        } else if (playerMove.equals("2") && computerMove.equals("1") || playerMove.equals("3") && computerMove.equals("2") || playerMove.equals("1") && computerMove.equals("3")) {
            points[1]++;
            rounds--;
        } else {
            System.out.println("Wrong input!");
        }

        return points;
    }

    public String displayMoveName(String move) {
        Map<String, String> moves = new HashMap<>();
        moves.put("1", "paper");
        moves.put("2", "stone");
        moves.put("3", "scissors");

        return moves.get(move);
    }

    public int getRounds() {
        return rounds;
    }
}
