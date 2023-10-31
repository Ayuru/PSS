package game;

import java.util.*;

public class GameLogic {

    private int rounds;

    public GameLogic(int rounds) {
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

    public Points calculatePoints(Move playerMove, Move computerMove, Points points) {

        if (playerMove.equals(computerMove)) {
            points.calculate(1, 1);
            rounds--;

        } else if (playerMove.win(computerMove)) {
            points.calculate(1, 0);
            rounds--;
        } else {
            points.calculate(0, 1);
            rounds--;
        }
        return points;
    }


    public int getRounds() {
        return rounds;
    }

}
