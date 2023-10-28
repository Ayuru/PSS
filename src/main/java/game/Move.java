package game;

public interface Move {

    public String getName();

    public boolean win(Move move);
}
