package game;

import java.util.Objects;

public class Stone implements Move {

    String name = "stone";

    public boolean win(Move move) {
        return move.getName().equals("scissors");
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stone stone = (Stone) o;
        return Objects.equals(name, stone.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}