package game;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTestSuite {

    @Test
    void testCalculatePointsIfDraw() {
        //Given
        GameDumbLogic as = new GameDumbLogic(1);
        List<String> computerMoves = new ArrayList<>();
        computerMoves.add("1");
        int[] points = {0, 0};
        //When
        points = as.calculatePoints("1", computerMoves.get(0), points);
        int[] expectedPoints = {1, 1};
        //Then
        assertEquals(expectedPoints[0], points[0]);
        assertEquals(expectedPoints[1], points[1]);

    }

    @Test
    void testCalculatePointsIfVictoryUsingPaper() {
        //Given
        GameDumbLogic as = new GameDumbLogic(1);
        List<String> computerMoves = new ArrayList<>();
        computerMoves.add("2");
        int[] points = {2, 1};
        //When
        points = as.calculatePoints("1", computerMoves.get(0), points);
        int[] expectedPoints = {3, 1};
        //Then
        assertEquals(expectedPoints[0], points[0]);
        assertEquals(expectedPoints[1], points[1]);

    }

    @Test
    void testCalculatePointsIfVictoryUsingStone() {
        //Given
        GameDumbLogic as = new GameDumbLogic(1);
        List<String> computerMoves = new ArrayList<>();
        computerMoves.add("3");
        int[] points = {2, 1};
        //When
        points = as.calculatePoints("2", computerMoves.get(0), points);
        int[] expectedPoints = {3, 1};
        //Then
        assertEquals(expectedPoints[0], points[0]);
        assertEquals(expectedPoints[1], points[1]);

    }

    @Test
    void testCalculatePointsIfVictoryUsingScissors() {
        //Given
        GameDumbLogic as = new GameDumbLogic(1);
        List<String> computerMoves = new ArrayList<>();
        computerMoves.add("1");
        int[] points = {2, 1};
        //When
        points = as.calculatePoints("3", computerMoves.get(0), points);
        int[] expectedPoints = {3, 1};
        //Then
        assertEquals(expectedPoints[0], points[0]);
        assertEquals(expectedPoints[1], points[1]);

    }

    @Test
    void testCalculatePointsIfDefeatUsingPaper() {
        //Given
        GameDumbLogic as = new GameDumbLogic(1);
        List<String> computerMoves = new ArrayList<>();
        computerMoves.add("3");
        int[] points = {2, 1};
        //When
        points = as.calculatePoints("1", computerMoves.get(0), points);
        int[] expectedPoints = {2, 2};
        //Then
        assertEquals(expectedPoints[0], points[0]);
        assertEquals(expectedPoints[1], points[1]);

    }

    @Test
    void testCalculatePointsIfDefeatUsingStone() {
        //Given
        GameDumbLogic as = new GameDumbLogic(1);
        List<String> computerMoves = new ArrayList<>();
        computerMoves.add("1");
        int[] points = {2, 1};
        //When
        points = as.calculatePoints("2", computerMoves.get(0), points);
        int[] expectedPoints = {2, 2};
        //Then
        assertEquals(expectedPoints[0], points[0]);
        assertEquals(expectedPoints[1], points[1]);

    }

    @Test
    void testCalculatePointsIfDefeatUsingScissors() {
        //Given
        GameDumbLogic as = new GameDumbLogic(1);
        List<String> computerMoves = new ArrayList<>();
        computerMoves.add("2");
        int[] points = {2, 1};
        //When
        points = as.calculatePoints("3", computerMoves.get(0), points);
        int[] expectedPoints = {2, 2};
        //Then
        assertEquals(expectedPoints[0], points[0]);
        assertEquals(expectedPoints[1], points[1]);

    }
}
