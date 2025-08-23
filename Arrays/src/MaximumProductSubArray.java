public class MaximumProductSubArray {
}

//https://leetcode.com/problems/maximum-product-subarray/


//class Solution {
//    public int maxProduct(int[] nums) {
//        int leftProduct = 1;
//        int rightProduct = 1;
//        int maxProduct = nums[0];
//
//        for(int i=0; i<nums.length; i++){
//            leftProduct = leftProduct == 0 ? 1 : leftProduct;
//            rightProduct = rightProduct == 0 ? 1 : rightProduct;
//
//            leftProduct*=nums[i];
//            rightProduct*=nums[nums.length - i -1];
//
//            maxProduct = Math.max(maxProduct, Math.max(leftProduct,rightProduct));
//        }
//        return maxProduct;
//    }
//}