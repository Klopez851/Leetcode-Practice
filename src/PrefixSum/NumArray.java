package PrefixSum;

import java.util.Arrays;

//exge cases: array input is empty,
public class NumArray{
    private int[] prefixSum;

    public NumArray(int[] nums) {
        this.prefixSum = new int[nums.length+1]; // we need the array to be one bigger to have space for the default 0
        prefixSum[0] = 0; // assigning the default 0 to the array

        int runninSum = 0;

        for(int i = 0; i<nums.length;i++){
            runninSum += nums[i];
            prefixSum[i+1] = runninSum;
        }
        System.out.println("prefix sum = "+ Arrays.toString(prefixSum));
    }

    //clarifying question, are the inputs indexes or element positions?
    public int sumRange(int left, int right) {
        if(left == 0){// if the range starts at the start of the list
            return prefixSum[right+1];
        }

        return prefixSum[right+1] - prefixSum[left];
        // bc all the elements are shifted one to the right, we need to make right account for that,
        // and since left would have been left -1 we dnt have to do that because the +1 accounted for that
    }
}