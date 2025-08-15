public class RearrangeArrayElementBySIgn {
}

//https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
//class Solution {
//    public int[] rearrangeArray(int[] nums) {
//        int[] ans = new int[nums.length];
//        int currPosIndex = 0;
//        int currNegIndex = 1;
//        for(int i=0; i<nums.length; i++){
//            //are you postive??
//            if(nums[i]>0){
//                ans[currPosIndex] = nums[i];
//                currPosIndex+=2;
//            }else{
//                ans[currNegIndex] = nums[i];
//                currNegIndex+=2;
//            }
//        }
//        return ans;
//    }
//}