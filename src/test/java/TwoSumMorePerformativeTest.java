import com.ryuri.easy.TwoSum;
import com.ryuri.easy.TwoSumMorePerformative;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSumMorePerformativeTest {

    @Test
    void validReturnTarget01() {
        int[] listResult = {0, 1};
        int[] listIntOne = {2, 7, 11, 15};

        int[] result = TwoSumMorePerformative.twoSum(listIntOne, 9);

        assertEquals(2, Arrays.stream(result).count());
        assertArrayEquals(listResult, result);
    }

    @Test
    void validReturnTarget02() {
        int[] listResult = {1, 2};
        int[] listInt = {3, 2, 4};

        int[] result = TwoSumMorePerformative.twoSum(listInt, 6);

        assertEquals(2, Arrays.stream(result).count());
        assertArrayEquals(listResult, result);
    }

    @Test
    void validReturnTarget03() {
        int[] listResult = {0, 1};
        int[] listInt = {3, 3};

        int[] result = TwoSumMorePerformative.twoSum(listInt, 6);

        assertEquals(2, Arrays.stream(result).count());
        assertArrayEquals(listResult, result);
    }

}
