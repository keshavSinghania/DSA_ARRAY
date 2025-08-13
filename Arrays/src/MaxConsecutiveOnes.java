public class MaxConsecutiveOnes {
}

//https://leetcode.com/problems/max-consecutive-ones/

//class Solution {
//    public int findMaxConsecutiveOnes(int[] nums) {
//        int maxCons = 0;
//        int numsOfOnce = 0;
//        for(int i=0 ; i<nums.length; i++){
//            if(nums[i]==1){
//                numsOfOnce++;
//                if(numsOfOnce>maxCons){
//                    maxCons = numsOfOnce;
//                }
//            }else{
//                numsOfOnce = 0;
//            }
//        }
//        return maxCons;
//    }
//}