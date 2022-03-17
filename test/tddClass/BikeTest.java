package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    /*@Test
    @DisplayName("Test that the bike can be turned on")
    public void turnOnTest(){
        //given
        Bike parago = new Bike();
        parago.turnOn(false);
        //when
        parago.turnOn(true);
        //assert
        assertEquals(true, parago.isOn());
    }

    @Test
    @DisplayName("Test that the bike can be turned off")
    public void turnOffTest(){
        //given
        Bike parago = new Bike();
        parago.turnOn(true);
        //when
        parago.turnOn(false);
        //
        assertEquals(false, parago.isOn());
    }*/

    @Test
    public void turnOnTest(){
        //given
        Bike parago = new Bike();
        //when
        parago.turnOn(true);
        //assert
        assertTrue(parago.isOn());
    }

    @Test
    public void turnOffTest(){
        //given
        Bike parago = new Bike();
        //when
        parago.turnOn(false);
        //assert
        assertFalse(parago.isOn());
    }

    @Test
    @DisplayName("Test that if on gear one accelerate, speed increments by 1")
    public void gearOneAccelerateTest(){
        //given
        Bike parago = new Bike();
        parago.turnOn(true);
        //when
        parago.gearOneAccelerate(15);
        //assert
        assertEquals(16, parago.speedLevel());
    }

    @Test
    @DisplayName("Test that if on gear two accelerate, speed increments by 2")
    public void gearTwoAccelerateTest(){
        //given
        Bike parago = new Bike();
        parago.turnOn(true);
        //when
        parago.gearTwoAccelerate(12);
        //assert
        assertEquals(14, parago.speedLevel());
    }

    @Test
    @DisplayName("Test that if on gear three accelerate, speed increments by 3")
    public void gearThreeAccelerateTest(){
        //given
        Bike parago = new Bike();
        parago.turnOn(true);
        //when
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();

        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        //assert
        assertEquals(31, parago.speedLevel());
    }

    @Test
    @DisplayName("Test that if on gear four accelerate, speed increments by 4")
    public void gearFourAccelerateTest(){
        //given
        Bike parago = new Bike();
        parago.turnOn(true);
        //when
        parago.gearFourAccelerate(10);
        //assert
        assertEquals(14, parago.speedLevel());
    }

    @Test
    @DisplayName("Test that if on deccelerate gear one, speed decrements by 1")
    public void gearOneDeccelerateTest(){
        //given
        Bike parago = new Bike();
        parago.turnOn(true);
        //when
        parago.gearOneDeccelerate(10);
        //when
        assertEquals(9, parago.speedLevel());
    }

    @Test
    @DisplayName("Test that if on deccelerate gear two, speed decrements by 2")
    public void gearTwoDeccelerateTest(){
        //given
        Bike parago = new Bike();
        parago.turnOn(true);
        //when
        parago.gearTwoDeccelerate(10);
        //when
        assertEquals(8, parago.speedLevel());
    }

    @Test
    @DisplayName("Test that if on deccelerate gear three, speed decrements by 3")
    public void gearThreeDeccelerateTest(){
        //given
        Bike parago = new Bike();
        parago.turnOn(true);
        //when
        parago.gearThreeDeccelerate(10);
        //when
        assertEquals(7, parago.speedLevel());
    }

    @Test
    @DisplayName("Test that if on deccelerate gear four, speed decrements by 4")
    public void gearFourDeccelerateTest(){
        //given
        Bike parago = new Bike();
        parago.turnOn(true);
        //when
        parago.gearFourDeccelerate(10);
        //when
        assertEquals(6, parago.speedLevel());
    }

    @Test
    @DisplayName("Test to show that gear changes automatically as speed changes")
    public void gearRangeTest(){
        //given
        Bike parago = new Bike();
        parago.turnOn(true);
        //when
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        parago.gearAccelerate();
        //assert
        assertEquals(31, parago.speedLevel());
    }
}
