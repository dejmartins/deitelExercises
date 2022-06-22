package DataStructures;

import DataStructures.Array.CaesarCipher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarCipherTest {
    @Test
    public void transformText_GivenACode(){
        CaesarCipher cipher = new CaesarCipher(3);
        assertEquals("WKH", cipher.encrypt("THE"));
    }
}
