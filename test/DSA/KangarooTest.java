package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KangarooTest {

    @Test
    public void testKangaroo(){
        Kangaroo kan = new Kangaroo();

        String answer = kan.kangaroo(0, 2, 5, 3);
        assertEquals("NO", answer);

        String answer2 = kan.kangaroo(0, 3, 4, 2);
        assertEquals("YES", answer2);

        String answer3 = kan.kangaroo(21, 6, 47, 3);
        assertEquals("NO", answer3);
    }

}