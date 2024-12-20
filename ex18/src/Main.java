public class Main {
    public static void main(String[] args) {
        Solution.MedianOfTwoSortedArrays solution = new Solution.MedianOfTwoSortedArrays();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("The median is: " + solution.findMedianSortedArrays(nums1, nums2));  // Output: 2.0

        nums1 = new int[]{1, 2};
        nums2 = new int[]{3, 4};
        System.out.println("The median is: " + solution.findMedianSortedArrays(nums1, nums2));  // Output: 2.5
    }
}