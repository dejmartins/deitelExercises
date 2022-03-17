package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionSetTest {
    @Test
    @DisplayName("Test to turn on television")
    public void turnOn() {
        //given
        TelevisionSet appleTv = new TelevisionSet();
        //when
        appleTv.powerButton(true);
        //assert
        assertTrue(appleTv.isOn());
    }

    @Test
    @DisplayName("Test to turn off television")
    public void turnOff() {
        //given
        TelevisionSet appleTv = new TelevisionSet();
        //when
        appleTv.powerButton(false);
        //assert
        assertFalse(appleTv.isOn());
    }

    @Test
    @DisplayName("Test to increase television volume")
    public void increaseVolumeTest() {
        //given
        TelevisionSet appleTv = new TelevisionSet();
        appleTv.powerButton(true);
        //when
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();

        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();

        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();

        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();

        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();

        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();

        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();

        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();

        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();

        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();

        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        appleTv.increaseVolume();
        //
        assertEquals(100, appleTv.volume());
    }

    @Test
    @DisplayName("Test to reduce volume")
    public void decreaseVolumeTest(){
        //given
        TelevisionSet appleTv = new TelevisionSet();
        appleTv.powerButton(true);
        //when
        appleTv.decreaseVolume();
        appleTv.decreaseVolume();
        //assert
        assertEquals(0, appleTv.volume());
    }

    @Test
    @DisplayName("Test to change input source")
    public void sourceTest(){
        //given
        TelevisionSet appleTv = new TelevisionSet();
        appleTv.powerButton(true);
        //when
        appleTv.changeSource("AV2");
        //assert
        assertEquals(0, appleTv.channel());
    }

    @Test
    @DisplayName("Test to change channel in source")
    public void changeChannelTest(){
        //given
        TelevisionSet appleTv = new TelevisionSet();
        appleTv.powerButton(true);
        appleTv.changeSource("AV1");
        //when
        appleTv.changeChannel(10);
        appleTv.changeChannel(15);
        //assert
        assertEquals(15, appleTv.channel());
    }

    @Test
    @DisplayName("Test to check HDMI channels")
    public void changeSourceTest(){
        //given
        TelevisionSet appleTv = new TelevisionSet();
        appleTv.powerButton(true);
        appleTv.changeSource("AV1");
        //when
        appleTv.changeSource("HDMI");
        appleTv.changeChannel(13);
        //assert
        assertEquals(0, appleTv.channel());
    }
}
