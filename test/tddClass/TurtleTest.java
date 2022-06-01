package tddClass;

import Turtle .*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    private Turtle turtle;
    @BeforeEach
    private void setUp(){
        turtle = new Turtle();
    }
    @Test
    public void turtleExistTest(){
        assertNotNull(turtle);
    }
    @Test
    public void testThatTurtlePenIsUpByDefault(){
        boolean isPenDown = turtle.isPenDown();
        assertFalse(isPenDown);
    }
    @Test
    public void PenIsDownTest(){
        turtle.penDown();
        boolean isPenDown = turtle.isPenDown();
        assertTrue(isPenDown);
    }
    @Test
    public void PenCanBeMovedBackUpTest(){
        turtle.penDown();
        boolean isPenDown = turtle.isPenDown();
        assertTrue(isPenDown);

        turtle.penUp();
        assertFalse(turtle.isPenDown());
    }
    @Test
    public void turtleFacesEastByDefaultTest(){
        assertEquals(Direction.EAST,turtle.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnRightFromEastTest(){
        turtle.turnRight();
        assertEquals(Direction.SOUTH,turtle.getCurrentDirection());

    }
    @Test
    public void turtleCanTurnRightFromSouthToWestTest(){
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(Direction.WEST,turtle.getCurrentDirection());

    }
    @Test
    public void turtleCanTurnRightFromWestToNorthTest(){
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(Direction.NORTH,turtle.getCurrentDirection());

    }
    @Test
    public void turtleCanTurnRightFromNorthToEastTest(){
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(Direction.EAST,turtle.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnLeftWhileFacingEastTest(){
        turtle.turnLeft();
        assertEquals(Direction.NORTH,turtle.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnLeftWhileFacingNorthTest(){
        turtle.turnLeft();
        turtle.turnLeft();
        assertEquals(Direction.WEST,turtle.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnLeftWhileFacingWestTest(){
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertEquals(Direction.SOUTH,turtle.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnLeftWhileFacingSouthTest(){
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertEquals(Direction.EAST,turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanMoveForwardFacingEastTest(){
        turtle.move(3);
        assertEquals(new Position(0,2), turtle.getCurrentPosition());

        turtle.move(2);
        assertEquals(new Position(0,3), turtle.getCurrentPosition());
    }

    @Test
    public void turtleCanMoveForwardFacingSouthTest(){
        turtle.move(3);
        assertEquals(new Position(0,2), turtle.getCurrentPosition());
        turtle.turnRight();

        turtle.move(2);
        assertEquals(new Position(1,2), turtle.getCurrentPosition());
    }

    @Test
    public void turtleCanMoveBackwardFacingWestTest(){
        turtle.move(3);
        assertEquals(new Position(0,2), turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.move(3);
        assertEquals(new Position(2,2), turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.move(2);
        assertEquals(new Position(2,1), turtle.getCurrentPosition());
    }

    @Test
    public void turtleCanMoveBackwardFacingNorthTest(){
        turtle.move(3);
        assertEquals(new Position(0,2), turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.move(3);
        assertEquals(new Position(2,2), turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.move(3);
        assertEquals(new Position(2,0), turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.move(3);
        assertEquals(new Position(0,0), turtle.getCurrentPosition());
    }


}
