package difficulties.easy;

import com.ryuri.difficulties.easy.RomanToInt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToIntTest {

    RomanToInt roman = new RomanToInt();

    @Test
    public void sholderReturnFour() {
        int iv = roman.romanToInt("IV");
        Assertions.assertEquals(4, iv);
    }
}
