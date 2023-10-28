package game;

import java.util.Objects;

public class Paper implements Move {

    String name = "paper";

    public boolean win(Move move) {
        return move.getName().equals("stone");
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paper paper = (Paper) o;
        return Objects.equals(name, paper.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}