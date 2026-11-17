package MonotonicStack;

/*
The next greater element of some element x in an array is the first greater element that is to the right of x in the
same array.

You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element
of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.

Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.

 Example 1:

Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.

Example 2:

Input: nums1 = [2,4], nums2 = [1,2,3,4]
Output: [3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
- 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.


 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //hashmap to store the index of the num one
        HashMap<Integer, Integer> nums1Index = new HashMap<>();

        for (int i = 0; i <nums1.length ; i++) {
            nums1Index.put(nums1[i], i);
        }

        //a result array that will say what the next greatest element is
        int[] nextGreatestList = new int[nums1.length];
        Arrays.fill(nextGreatestList, -1);

        // a monotonic stack
        Stack<Integer> monotonicStack = new Stack<>();

        //for loop going through nums2
        for (int i = 0; i <nums2.length ; i++) {
            //get the current value at nums 2
            int currentValue = nums2[i];
            //while the stack isnt empty and the current value is bigger then the top off the stack
            //get the index  of the value at the top of the stack
            //add the current value to that index in the result array
            while(!(monotonicStack.empty()) && currentValue >monotonicStack.peek()){
                int topOfStack = monotonicStack.pop();
                int index = nums1Index.get(topOfStack);
                nextGreatestList[index] = currentValue;
            }
            //if the current value is a key on the hasmap add it to the array
            if(nums1Index.containsKey(currentValue)){
                monotonicStack.push(currentValue);
            }

        }

        //return the result array
        return nextGreatestList;

    }

    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));

    }

}
