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

        } else if ((Integer.parseInt(playerMove) + 1) % 3 == Integer.parseInt(computerMove) % 3) {
            points[0]++;
            rounds--;
        } else {
            points[1]++;
            rounds--;
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
