package game;

public class Points {

    private int[] points = {0, 0};

    public void calculate(int player, int computer) {
        points[0] = points[0] + player;
        points[1] = points[1] + computer;
    }

    public int getPlayerPoints() {
        return points[0];
    }

    public int getComputerPoints() {
        return points[1];
    }
}
