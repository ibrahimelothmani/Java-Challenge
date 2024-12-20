class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
            int temp2 = m;
            m = n;
            n = temp2;
        }
        int left = 0;
        int right = m;
        double median = 0.0;
        while (left <= right) {
            int partitionX = (left + right) / 2;
            int partitionY = (m + n + 1) / 2 - partitionX;
            int maxLeftX = (partitionX == 0)? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minRightX = (partitionX == m)? Integer.MAX_VALUE : nums1[partitionX];
            int maxLeftY = (partitionY == 0)? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minRightY = (partitionY == n)? Integer.MAX_VALUE : nums2[partitionY];
            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                if ((m + n) % 2 == 0) {
                    median = (double) (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
                } else {
                    median = (double) Math.max(maxLeftX, maxLeftY);
                }
                break;
            } else if (maxLeftX > minRightY) {
                right = partitionX - 1;
            } else {
                left = partitionX + 1;
            }

        }
        return median;
    }
}
