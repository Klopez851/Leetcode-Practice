package TopKElement;

/*
 * You are part of a university admissions office and need to keep track of the kth
 * highest test score from applicants in real-time. This helps determine cut-off
 * marks for interviews and admissions dynamically as new applicants submit their scores.
 *
 * You are tasked with implementing a class that, for a given integer k, maintains
 * a stream of test scores and continuously returns the kth highest test score after
 * a new score has been submitted.
 *
 * More specifically, we are looking for the kth highest score in the sorted list
 * of all scores.
 *
 * Implement the KthLargest class:
 *
 * 1. KthLargest(int k, int[] nums)
 *    Initializes the object with the integer k and the stream of test scores nums.
 *
 * 2. int add(int val)
 *    Adds a new test score val to the stream and returns the element representing
 *    the kth largest element in the pool of test scores so far.
 */


public class KthLargestElementinaStream {
    public static void main(String[] args) {
        int kthLargestInt = 3;
        int[] initialList = {4,5,8,2};

        KthLargest kthLargest = new KthLargest(kthLargestInt,initialList);

        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(4));
    }
}
