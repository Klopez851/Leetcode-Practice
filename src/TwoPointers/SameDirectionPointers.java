package TwoPointers;

/* Clarifying Questions - Move Zeroes
Should the relative order of non-zero elements remain the same?
Do I need to modify the original array in-place, or can I create a new array?
Should negative numbers be treated as non-zero elements?
Should I move only elements equal to 0?
Should I modify the original array directly, or return a new array?
Are there any time or space complexity requirements?
Can the array contain duplicate non-zero elements?
Should consecutive zeros be moved to the end while preserving the order of the other elements?
*/

public class SameDirectionPointers {

    public SameDirectionPointers(){}

    //clarifying questions: will the array always have values in it?
    public void moveZeroes(int[] nums) {
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
}
