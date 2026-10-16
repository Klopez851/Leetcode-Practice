package TwoPointers;

/* Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note: You must do this in-place without making a copy of the array.

Example 1: Input: nums = [0, 1, 0, 3, 12] Output: [1, 3, 12, 0, 0]

Example 2: Input: nums = [0] Output: [0]

Constraints:

1 <= nums.length <= 10^4
-2^31 <= nums[i] <= 2^31 - 1 */

/*
* inputs = an array of ints with zeroes
* outputs = said array, with no zeroes in it
* */

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        SameDirectionPointers sameDirectionPointers = new SameDirectionPointers();
        int[] nums = {1, 2, 0, 3, 12};
        sameDirectionPointers.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }


}
