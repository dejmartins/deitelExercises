package DSA;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesByMatchTest {

    @Test
    public void testSocksMerchantMethod(){
        SalesByMatch match = new SalesByMatch();
        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(1);
        ar.add(2);
        ar.add(1);
        ar.add(3);
        ar.add(2);

        int matchedPair = match.sockMerchant(7, ar);
        assertEquals(2, matchedPair);
    }
}