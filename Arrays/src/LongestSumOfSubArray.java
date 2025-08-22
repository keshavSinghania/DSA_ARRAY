public class LongestSumOfSubArray {
}
//class Solution {
//    public int longestSubarray(int[] nums, int k) {
//        int left = 0, right = 0;
//        int maxLength = 0;
//        int sum = 0;
//        int n = nums.length;
//
//        while (right < n) {
//            // expand window
//            sum += nums[right];
//
//            // shrink window while sum > k
//            while (left <= right && sum > k) {
//                sum -= nums[left];
//                left++;
//            }
//
//            // check equal
//            if (sum == k) {
//                maxLength = Math.max(maxLength, right - left + 1);
//            }
//
//            // move right ahead
//            right++;
//        }
//
//        return maxLength;
//    }
//}
