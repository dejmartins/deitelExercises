package DSA;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GetTotalXTest {

    @Test
    public void testGetTotal(){
        GetTotalX total = new GetTotalX();
        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(6);

        List<Integer> b = new ArrayList<>();
        b.add(24);
        b.add(36);

        int result = total.getTotal(a, b);
        assertEquals(2, result);
    }


}