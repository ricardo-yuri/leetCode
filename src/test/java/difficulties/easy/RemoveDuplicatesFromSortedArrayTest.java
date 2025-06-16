package difficulties.easy;

import com.ryuri.difficulties.easy.RemoveDuplicatesFromSortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void validReturnCaseOne() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int result = RemoveDuplicatesFromSortedArray.removeDuplicates(nums);

        assertEquals(5,result);
    }

}
