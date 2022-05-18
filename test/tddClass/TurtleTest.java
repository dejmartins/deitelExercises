package tddClass;

import Turtle.Turtle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {

    Turtle ipaja;

    @BeforeEach
    public void startsWith(){
        ipaja = new Turtle();
    }

    @Test
    public void turtleExistsTest(){;
        assertNotNull(ipaja);
    }

    @Test
    public void turtlePenIsUpByDefault(){
        boolean isPenDown = ipaja.isPenDown();
        assertFalse(isPenDown);
    }

    @Test
    public void turtleCanMovePenDownTest(){
        ipaja.penDown();
        boolean isPenDown = ipaja.isPenDown();
        assertTrue(isPenDown);
    }
}
