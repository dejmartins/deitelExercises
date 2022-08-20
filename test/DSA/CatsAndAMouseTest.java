package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatsAndAMouseTest {

    @Test
    public void testCatAndMouseMethod(){
        CatsAndAMouse catchMouse = new CatsAndAMouse();
        String result = catchMouse.catAndMouse(2, 5, 4);
        assertEquals("Cat B", result);
    }
}