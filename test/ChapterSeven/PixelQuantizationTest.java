package ChapterSeven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PixelQuantizationTest {

    @Test
    public void testQuantization(){
        PixelQuantization quantization = new PixelQuantization();
        //Given
        int[] imagePixels = {10, 15, 35, 45, 90, 87, 23, 45, 90, 185};
        //When
        int[] quantizedValues = quantization.quantizeImagePixelValues(imagePixels);
        //Assert
        assertEquals(10, quantizedValues[0]);
        assertEquals(10, quantizedValues[1]);
        assertEquals(30, quantizedValues[2]);
        assertEquals(190, quantizedValues[9]);
    }
}