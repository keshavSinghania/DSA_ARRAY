public class GreaterThanNDivide3 {
}

//class Solution {
//    public List<Integer> majorityElement(int[] nums) {
//        int count1=0;
//        int count2=0;
//        int ele1=Integer.MIN_VALUE;
//        int ele2=Integer.MIN_VALUE;
//        for(int i=0; i<nums.length; i++){
//            if(count1==0 && nums[i]!=ele2){
//                count1++;
//                ele1=nums[i];
//            }else if(count2==0 && nums[i]!=ele1){
//                count2++;
//                ele2=nums[i];
//            }else if(nums[i]==ele1){
//                count1++;
//            }else if(nums[i]==ele2){
//                count2++;
//            }else{
//                count1--;
//                count2--;
//            }
//        }
//        List<Integer> ans = new ArrayList<>();
//        int threshold = nums.length / 3;
//
//        // verifing
//        count1 = 0;
//        count2 = 0;
//        for (int num : nums) {
//            if (num == ele1) count1++;
//            else if (num == ele2) count2++;
//        }
//        if (count1 > threshold) ans.add(ele1);
//        if (count2 > threshold) ans.add(ele2);
//        return ans;
//    }
//}



// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
//         List<Integer> ans = new ArrayList<>();
//         for(int i=0; i<nums.length; i++){
//             if(count(nums,nums[i])>(nums.length/3) && !ans.contains(nums[i])){
//                 ans.add(nums[i]);
//             }
//         }
//         return ans;
//     }
//     //check count of parameter ele
//     int count(int[]arr, int ele){
//         int count =0;
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]==ele){
//                 count++;
//             }
//         }
//         return count;
//     }
// }