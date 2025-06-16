package difficulties.easy;

import com.ryuri.difficulties.easy.ReverseString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseStringTest {

    @Test
    void validReturnTarget01() {
        char[] listResult = {'o','l','l','e','h'};
        char[] listIntOne = {'h','e','l','l','o'};

        ReverseString.reverseString(listIntOne);

        Assertions.assertNotNull(null);
//        assertEquals(2, Arrays.stream(result).count());
//        assertArrayEquals(listResult, result);
    }
}
