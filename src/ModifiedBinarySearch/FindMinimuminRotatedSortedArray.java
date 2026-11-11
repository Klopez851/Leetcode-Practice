package ModifiedBinarySearch;

public class FindMinimuminRotatedSortedArray {
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int middle;

        while(left<right){
            middle=Math.floorDiv(left+right, 2);

            if(nums[middle]> nums[right]){
                left = middle+1;
            } else if (nums[middle]<nums[right]) {
                right = middle;
            }
        }

        return nums[left];

    }

    public static int findMax(int[] nums){
        int left = 0;
        int right = nums.length-1;
        int middle;

        while(left<right){
            middle=Math.floorDiv(left+right, 2);

            if(nums[middle]> nums[right]){
                right = middle;
            } else if (nums[middle]<nums[right]) {
                left = middle+1;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {11,13,15,17};
        System.out.println(findMin(nums));
        System.out.println(findMax(nums));
    }
}
