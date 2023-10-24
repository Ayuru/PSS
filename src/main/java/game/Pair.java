package game;

public class Pair {
    private final String name;
    private final int rounds;

    public Pair(String name, int rounds) {
        this.name = name;
        this.rounds = rounds;
    }

    public String getName() {
        return name;
    }

    public int getRounds() {
        return rounds;
    }
}
