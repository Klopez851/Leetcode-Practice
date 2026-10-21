package SlidingWindow.FixedSlidingWindow;

/*
You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.

Any answer with a calculation error less than 10^-5 will be accepted.

Example 1:
Input: nums = [1, 12, -5, -6, 50, 3], k = 4
Output: 12.75000

Explanation:
Maximum average is (12 - 5 - 6 + 50) / 4
= 51 / 4
= 12.75

Example 2:
Input: nums = [5], k = 1
Output: 5.00000

Constraints:
- n == nums.length
- 1 <= k <= n <= 10^5
- -10^4 <= nums[i] <= 10^4
*/

public class MaximumAverageSubArrayI {

    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i <k ; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        //prev sum did it from 0 to k-1, and here we start at k
        for (int i = k; i <nums.length; i++) {
            sum = (sum - nums[i-k]) + nums[i];

            if(sum>maxSum){
                maxSum = sum;
            }

        }

        return (double) maxSum/k;
    }

    public static void main(String[] args) {

        int[] nums = {5};
        int k = 1;

        System.out.println(findMaxAverage(nums, k));
    }
}
