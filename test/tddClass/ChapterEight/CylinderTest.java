package tddClass.ChapterEight;

import ChapterEight.Cylinder.Cylinder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CylinderTest {
    @Test
    public void testCylinderVolume(){
        Cylinder silly = new Cylinder();
        silly.setHeight(10);
        silly.setRadius(2);
        assertEquals(125.66, silly.volume());
    }
}
