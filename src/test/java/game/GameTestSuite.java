package game;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTestSuite {

    @Test
    void testCalculatePointsIfDraw() {
        //Given
        GameLogic as = new GameLogic(1);
        List<Move> computerMoves = new ArrayList<>();
        computerMoves.add(new Paper());
        Points points = new Points();


        //When
        points = as.calculatePoints(new Paper(), computerMoves.get(0), points);

        //Then
        assertEquals(1, points.getPlayerPoints());
        assertEquals(1, points.getComputerPoints());

    }

    @Test
    void testCalculatePointsIfVictoryUsingPaper() {
        //Given
        GameLogic as = new GameLogic(1);
        List<Move> computerMoves = new ArrayList<>();
        computerMoves.add(new Stone());
        Points points = new Points();

        //When
        points = as.calculatePoints(new Paper() , computerMoves.get(0), points);

        //Then
        assertEquals(1, points.getPlayerPoints());
        assertEquals(0, points.getComputerPoints());

    }

    @Test
    void testCalculatePointsIfVictoryUsingStone() {
        //Given
        GameLogic as = new GameLogic(1);
        List<Move> computerMoves = new ArrayList<>();
        computerMoves.add(new Scissors());
        Points points = new Points();

        //When
        points = as.calculatePoints(new Stone(), computerMoves.get(0), points);

        //Then
        assertEquals(1, points.getPlayerPoints());
        assertEquals(0, points.getComputerPoints());

    }

    @Test
    void testCalculatePointsIfVictoryUsingScissors() {
        //Given
        GameLogic as = new GameLogic(1);
        List<Move> computerMoves = new ArrayList<>();
        computerMoves.add(new Scissors());
        Points points = new Points();

        //When
        points = as.calculatePoints(new Stone(), computerMoves.get(0), points);

        //Then
        assertEquals(1, points.getPlayerPoints());
        assertEquals(0, points.getComputerPoints());

    }

    @Test
    void testCalculatePointsIfDefeatUsingPaper() {
        //Given
        GameLogic as = new GameLogic(1);
        List<Move> computerMoves = new ArrayList<>();
        computerMoves.add(new Scissors());
        Points points = new Points();

        //When
        points = as.calculatePoints(new Paper(), computerMoves.get(0), points);

        //Then
        assertEquals(0, points.getPlayerPoints());
        assertEquals(1, points.getComputerPoints());

    }

    @Test
    void testCalculatePointsIfDefeatUsingStone() {
        //Given
        GameLogic as = new GameLogic(1);
        List<Move> computerMoves = new ArrayList<>();
        computerMoves.add(new Paper());
        Points points = new Points();

        //When
        points = as.calculatePoints(new Stone(), computerMoves.get(0), points);

        //Then
        assertEquals(0, points.getPlayerPoints());
        assertEquals(1, points.getComputerPoints());

    }

    @Test
    void testCalculatePointsIfDefeatUsingScissors() {
        //Given
        GameLogic as = new GameLogic(1);
        List<Move> computerMoves = new ArrayList<>();
        computerMoves.add(new Stone());
        Points points = new Points();

        //When
        points = as.calculatePoints(new Scissors(), computerMoves.get(0), points);

        //Then
        assertEquals(0, points.getPlayerPoints());
        assertEquals(1, points.getComputerPoints());

    }
}
