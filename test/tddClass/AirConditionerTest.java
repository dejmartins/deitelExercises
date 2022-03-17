package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionerTest {
    @Test
    @DisplayName("Test to turn the air-conditioner on")
    public void setAirConditionerOnTest(){
        //given
        AirConditioner panasonic = new AirConditioner();
        System.out.println(panasonic.isOn());
        //when
        panasonic.setOn(true);
        //assert
        assertTrue(panasonic.isOn());
    }

    @Test
    @DisplayName("Test to check if ac will turn off when required")
    public void setAirConditionerOffTest(){
        //given
        AirConditioner panasonic = new AirConditioner();
        panasonic.setOn(true);
        //when
        panasonic.setOn(false);
        //assert
        assertEquals(false, panasonic.isOn());
    }

    @Test
    @DisplayName("Test that the temperature can be increased")
    public void increaseTemperatureTest(){
        //given
        AirConditioner panasonic = new AirConditioner();
        panasonic.setOn(true);
        //when
        panasonic.increaseTemperature();
        //assert
        assertEquals(17, panasonic.getTemperature());
    }

    @Test
    @DisplayName("Test that temperature can be decreased")
    public void decreaseTemperatureTest(){
        //given
        AirConditioner panasonic = new AirConditioner();
        panasonic.setOn(true);
        //when
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.decreaseTemperature();
        //assert
        assertEquals(18, panasonic.getTemperature());
    }

    @Test
    @DisplayName("Test that ac cannot be increased beyond 30")
    public void increaseBeyondThirtyTest(){
        //given
        AirConditioner panasonic = new AirConditioner();
        panasonic.setOn(true);
        //when
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();

        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();

        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();

        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        //assert
        assertEquals(30, panasonic.getTemperature());
    }

    @Test
    @DisplayName("Test that ac cannot be decreased below 16")
    public void decreaseBelowSixteenTest(){
        //given
        AirConditioner panasonic = new AirConditioner();
        panasonic.setOn(true);
        //when
        panasonic.decreaseTemperature();
        panasonic.decreaseTemperature();
        panasonic.decreaseTemperature();
        panasonic.decreaseTemperature();
        panasonic.decreaseTemperature();
        panasonic.decreaseTemperature();
        //assert
        assertEquals(16, panasonic.getTemperature());
    }
}
