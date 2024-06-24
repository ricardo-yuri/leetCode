import com.ryuri.leetcode.easy.LengthOfLastWord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LengthOfLastWordTest {

    @Test
    void thenReturnFive () {
        int result = LengthOfLastWord.lengthOfLastWord("Hello World");
        Assertions.assertEquals(5, result);
    }

    @Test
    void thenReturnFour () {
        int result = LengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  ");
        Assertions.assertEquals(4, result);
    }

    @Test
    void thenReturnSix() {
        int result = LengthOfLastWord.lengthOfLastWord("luffy is still joyboy");
        Assertions.assertEquals(6, result);
    }

    @Test
    void thenReturnOne() {
        int result = LengthOfLastWord.lengthOfLastWord("a");
        Assertions.assertEquals(1, result);
    }
}
