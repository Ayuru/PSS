package game;

import java.util.*;

public class GameDumbLogic {

    private int rounds;

    public GameDumbLogic(int rounds) {
        this.rounds = rounds;
    }

    public List<Move> randomized() {
        List<Move> moves = new ArrayList<>();
        Random generator = new Random();
        MoveConverter converter = new MoveConverter();
        String result;

        for (int i = 0; i < rounds; i++) {

            result = String.valueOf(generator.nextInt(3) + 1);
            moves.add(converter.convert(result));
        }


        return moves;

    }

    public int[] calculatePoints(Move playerMove, Move computerMove, int[] points) {

        if (playerMove.equals(computerMove)) {
            points[0]++;
            points[1]++;
            rounds--;

        } else if (playerMove.win(computerMove)) {
            points[0]++;
            rounds--;
        } else {
            points[1]++;
            rounds--;
        }
        return points;
    }


    public int getRounds() {
        return rounds;
    }

}
