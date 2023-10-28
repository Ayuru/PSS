package game;

import java.util.Objects;

public class Scissors implements Move {

    String name = "scissors";;

    public boolean win(Move move) {
        return move.getName().equals("paper");
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scissors scissors = (Scissors) o;
        return Objects.equals(name, scissors.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}