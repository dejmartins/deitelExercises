package DSA;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FormingMagicSquareTest {

    @Test
    public void testMagicSquareFormationMethod(){
        FormingMagicSquare magicSquare = new FormingMagicSquare();
        List<List<Integer>> s = new ArrayList<>();

        List<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(3);
        a.add(4);

        List<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(5);
        b.add(8);

        List<Integer> c = new ArrayList<>();
        c.add(6);
        c.add(4);
        c.add(2);

        s.add(a);
        s.add(b);
        s.add(c);

        int result = magicSquare.formingMagicSquare(s);
        assertEquals(7, result);
    }

}