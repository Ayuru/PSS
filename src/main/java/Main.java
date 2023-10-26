import game.GameBoard;
import game.Pair;

public class Main {
    public static void main(String[] args) {

        boolean run = true;

        while (run) {
            GameBoard game = new GameBoard();
            try {
                Pair userData = game.intro();
                run = game.play(userData.getName(), userData.getRounds());
            } catch (Exception e) {
                System.out.println("Oh no! Something went wrong! Error: " + e + "\nLets try again!\n\n");
            }
        }

    }
}
