package DSA;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BillDivisionTest {
    @Test
    public void testBillDivisionAmongstFriends(){
        BillDivision div = new BillDivision();
        List<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);

        String result = div.bonAppetite(bill, 1, 12);
        assertEquals("5", result);
    }

}