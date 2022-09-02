package DSA;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TheHurdleRaceTest {

    @Test
    public void testHurdleRace(){
        TheHurdleRace race = new TheHurdleRace();

        List<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(2);
        height.add(3);
        height.add(3);
        height.add(2);

        int doses = race.hurdleRace(1, height);
        assertEquals(2, doses);
    }
}