package tddClass;

import ChapterFive.Extremes;
import org.junit.jupiter.api.Test;

import javax.print.attribute.standard.PresentationDirection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtremesTest {

    @Test
    public void maximumNumberTest(){
        Extremes max = new Extremes();
        int result = max.getMaximum(7, 3, 4, 5);
        assertEquals(7, result);
    }

    @Test
    public void minimumNumberTest(){
        Extremes min = new Extremes();
        int result = min.getMinimum(7, 3, 4, 5);
        assertEquals(3, result);
    }

    @Test
    public void sumOfMaxAndMin(){
        Extremes number = new Extremes();
        int result = number.sumOfMaxAndMin(1,2, 3, 4);
        assertEquals(5, result);
    }
}
