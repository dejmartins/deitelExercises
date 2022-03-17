package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeunBikeTest {

    @Test
    @DisplayName("Test to turn on Seun's bike")
    public void turnOnTest(){
        //given
        SeunBike parago = new SeunBike();
        //when
        parago.keySwitch(true);
        //assert
        assertEquals(true, parago.isOn());
    }

    @Test
    @DisplayName("Test to turn off seun's bike")
    public void turnOffTest(){
        SeunBike parago = new SeunBike();
        parago.keySwitch(false);
        assertEquals(false, parago.isOn());
    }

    @Test
    @DisplayName("Test that bike can be accelerated")
    public void accelerationTest(){
        //given
        SeunBike parago = new SeunBike();
        parago.keySwitch(false);
        //when
        parago.keySwitch(true);
        parago.gearAcceleration();
        parago.gearAcceleration();
        parago.gearAcceleration();
        parago.gearAcceleration();
        parago.gearAcceleration();
        parago.gearAcceleration();
        parago.gearAcceleration();
        parago.gearAcceleration();
        parago.gearAcceleration();
        parago.gearAcceleration();
//
        parago.gearAcceleration();
        parago.gearAcceleration();
        parago.gearAcceleration();
        parago.gearAcceleration();
        parago.gearAcceleration();
        parago.gearAcceleration();
        parago.gearAcceleration();
        parago.gearAcceleration();
        parago.gearAcceleration();
        parago.gearAcceleration();
        parago.gearAcceleration();

        parago.gearAcceleration();
        parago.gearAcceleration();
        parago.gearAcceleration();
        parago.gearAcceleration();
        parago.gearAcceleration();

        parago.gearAcceleration();

        parago.gearDecceleration();

        //assert
        assertEquals(31, parago.speed());
    }

}


