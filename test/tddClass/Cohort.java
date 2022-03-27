package tddClass;

import ChapterSix.AC;
import ChapterSix.Native;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Cohort {

    @Test
    public void turnOnAcTest(){
        AC afinAc = new AC();
        afinAc.setOn();
        assertTrue(afinAc.isOn());
    }

    @Test
    public void turnOffAcTest(){
        AC afinAc = new AC();
        afinAc.setOn();
        afinAc.setOn();
        assertFalse(afinAc.isOn());
    }

    @Test
    public void nativeSetAcTest(){
        AC afinAc = new AC();
        afinAc.setOn();
        assertTrue(afinAc.isOn());
        Native Ernest = new Native();
        Ernest.setOurAc(afinAc);
        assertEquals(afinAc, Ernest.getOurAc());
        Native Bridget = new Native();
        assertEquals(afinAc, Bridget.getOurAc());
        AC kiwiAc = new AC();
        Bridget.setOurAc(kiwiAc);
        assertEquals(kiwiAc, Ernest.getOurAc());
    }

    @Test
    public void setTemperatureTest(){
        AC afinAC = new AC();
        Native Tomisin = new Native();
        Tomisin.setOurAc(afinAC);
        assertEquals(afinAC, Tomisin.getOurAc());
        Tomisin.setOurAcTemperature(30);
        assertEquals(30, Tomisin.getOurAcTemperature());
        Native Stephen = new Native();
        assertEquals(30, Stephen.getOurAcTemperature());
        Stephen.setOurAcTemperature(12);
        assertNotNull(afinAC.getTemperature());
        assertEquals(12, afinAC.getTemperature());
    }


}

