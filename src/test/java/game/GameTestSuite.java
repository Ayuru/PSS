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
        int[] points = {0, 0};

        //When
        points = as.calculatePoints(new Paper(), computerMoves.get(0), points);
        int[] expectedPoints = {1, 1};

        //Then
        assertEquals(expectedPoints[0], points[0]);
        assertEquals(expectedPoints[1], points[1]);

    }

    @Test
    void testCalculatePointsIfVictoryUsingPaper() {
        //Given
        GameLogic as = new GameLogic(1);
        List<Move> computerMoves = new ArrayList<>();
        computerMoves.add(new Stone());
        int[] points = {2, 1};

        //When
        points = as.calculatePoints(new Paper() , computerMoves.get(0), points);
        int[] expectedPoints = {3, 1};

        //Then
        assertEquals(expectedPoints[0], points[0]);
        assertEquals(expectedPoints[1], points[1]);

    }

    @Test
    void testCalculatePointsIfVictoryUsingStone() {
        //Given
        GameLogic as = new GameLogic(1);
        List<Move> computerMoves = new ArrayList<>();
        computerMoves.add(new Scissors());
        int[] points = {2, 1};

        //When
        points = as.calculatePoints(new Stone(), computerMoves.get(0), points);
        int[] expectedPoints = {3, 1};

        //Then
        assertEquals(expectedPoints[0], points[0]);
        assertEquals(expectedPoints[1], points[1]);

    }

    @Test
    void testCalculatePointsIfVictoryUsingScissors() {
        //Given
        GameLogic as = new GameLogic(1);
        List<Move> computerMoves = new ArrayList<>();
        computerMoves.add(new Scissors());
        int[] points = {2, 1};

        //When
        points = as.calculatePoints(new Stone(), computerMoves.get(0), points);
        int[] expectedPoints = {3, 1};

        //Then
        assertEquals(expectedPoints[0], points[0]);
        assertEquals(expectedPoints[1], points[1]);

    }

    @Test
    void testCalculatePointsIfDefeatUsingPaper() {
        //Given
        GameLogic as = new GameLogic(1);
        List<Move> computerMoves = new ArrayList<>();
        computerMoves.add(new Scissors());
        int[] points = {2, 1};

        //When
        points = as.calculatePoints(new Paper(), computerMoves.get(0), points);
        int[] expectedPoints = {2, 2};

        //Then
        assertEquals(expectedPoints[0], points[0]);
        assertEquals(expectedPoints[1], points[1]);

    }

    @Test
    void testCalculatePointsIfDefeatUsingStone() {
        //Given
        GameLogic as = new GameLogic(1);
        List<Move> computerMoves = new ArrayList<>();
        computerMoves.add(new Paper());
        int[] points = {2, 1};

        //When
        points = as.calculatePoints(new Stone(), computerMoves.get(0), points);
        int[] expectedPoints = {2, 2};

        //Then
        assertEquals(expectedPoints[0], points[0]);
        assertEquals(expectedPoints[1], points[1]);

    }

    @Test
    void testCalculatePointsIfDefeatUsingScissors() {
        //Given
        GameLogic as = new GameLogic(1);
        List<Move> computerMoves = new ArrayList<>();
        computerMoves.add(new Stone());
        int[] points = {2, 1};

        //When
        points = as.calculatePoints(new Scissors(), computerMoves.get(0), points);
        int[] expectedPoints = {2, 2};

        //Then
        assertEquals(expectedPoints[0], points[0]);
        assertEquals(expectedPoints[1], points[1]);

    }
}
