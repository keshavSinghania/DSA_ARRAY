public class MajorityElement {
}
//..
//class Solution {
//    public int majorityElement(int[] nums) {
//        int ele=0;
//        int count=0;
//        for(int i = 0; i<nums.length; i++){
//            if(count == 0){
//                ele = nums[i];
//                count++;
//            }else{
//                if(nums[i]==ele){
//                    count++;
//                }else{
//                    count--;
//                }
//            }
//        }
//        if(isAns(nums,ele)){
//            return ele;
//        }else{
//            return -1;
//        }
//    }
//
//    //fucntion to check wheather it is ans or not
//    boolean isAns(int[] nums, int n){
//        int count = 0;
//        for(int i = 0; i<nums.length; i++){
//            if(n==nums[i]){
//                count++;
//            }
//            if(count>nums.length/2) return true;
//        }
//        return false;
//    }
//}