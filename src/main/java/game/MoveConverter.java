package game;

public class MoveConverter {

    public Move convert(String move) {
        if (move.equals("1")) {
            return new Paper();
        } else if (move.equals("2")) {
            return new Stone();
        } else {
            return new Scissors();
        }
    }

}
