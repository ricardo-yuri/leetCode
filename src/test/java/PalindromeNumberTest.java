import com.ryuri.easy.PalindromeNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeNumberTest {

    @Test
    public void validReturnTrue() {
        assertTrue(PalindromeNumber.isPalindrome(121));
    }

    @Test
    public void validReturnFalse() {
        assertFalse(PalindromeNumber.isPalindrome(-121));
    }

    @Test
    public void validReturnFalse01() {
        assertFalse(PalindromeNumber.isPalindrome(10));
    }
}
