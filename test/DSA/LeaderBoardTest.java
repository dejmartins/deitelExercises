package DSA;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeaderBoardTest {

    @Test
    public void testLeaderBoardClimbingMethod(){
        LeaderBoard leaderBoard = new LeaderBoard();

        List<Integer> ranked = new ArrayList<>();
        ranked.add(100);
        ranked.add(90);
        ranked.add(90);
        ranked.add(80);

        List<Integer> player = new ArrayList<>();
        player.add(70);
        player.add(80);
        player.add(105);

        List<Integer> result = leaderBoard.climbingLeaderBoard(ranked, player);
        assertEquals(result.get(0), 4);
        assertEquals(result.get(1), 3);
        assertEquals(result.get(2), 1);
    }

    @Test
    public void testLeaderBoardClimbingMethod2(){
        LeaderBoard leaderBoard = new LeaderBoard();

        List<Integer> ranked = new ArrayList<>();
        ranked.add(100);
        ranked.add(100);
        ranked.add(50);
        ranked.add(40);
        ranked.add(40);
        ranked.add(20);
        ranked.add(10);

        List<Integer> player = new ArrayList<>();
        player.add(5);
        player.add(25);
        player.add(50);
        player.add(120);

        List<Integer> result = leaderBoard.climbingLeaderBoard(ranked, player);
        assertEquals(result.get(0), 6);
        assertEquals(result.get(1), 4);
        assertEquals(result.get(2), 2);
        assertEquals(result.get(3), 1);
    }

    @Test
    public void testLeaderBoardClimbingMethod3(){
        LeaderBoard leaderBoard = new LeaderBoard();

        List<Integer> ranked = new ArrayList<>();
        ranked.add(100);
        ranked.add(90);
        ranked.add(90);
        ranked.add(80);
        ranked.add(75);
        ranked.add(60);

        List<Integer> player = new ArrayList<>();
        player.add(50);
        player.add(65);
        player.add(77);
        player.add(90);
        player.add(102);

        List<Integer> result = leaderBoard.climbingLeaderBoard(ranked, player);
        assertEquals(result.get(0), 6);
        assertEquals(result.get(1), 5);
        assertEquals(result.get(2), 4);
        assertEquals(result.get(3), 2);
    }

    @Test
    public void testLeaderBoardClimbingMethod4(){
        LeaderBoard leaderBoard = new LeaderBoard();

        List<Integer> ranked = new ArrayList<>();
        ranked.add(1);

        List<Integer> player = new ArrayList<>();
        player.add(1);
        player.add(1);

        List<Integer> result = leaderBoard.climbingLeaderBoard(ranked, player);
        assertEquals(result.get(0), 1);
        assertEquals(result.get(1), 1);
    }

}