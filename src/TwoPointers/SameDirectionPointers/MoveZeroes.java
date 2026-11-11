package TwoPointers.SameDirectionPointers;

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

    public static void moveZeroes(int[] nums){
        int left = 0;

        for(int right = 0; right< nums.length;right++){
            if(nums[right] != 0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left]=temp;
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 3,0, 12, 0};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }


}
