public class ThreeSum {
}
//https://leetcode.com/problems/3sum/



//class Solution {
//    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> ans = new ArrayList<>();
//        Arrays.sort(nums);
//        int n = nums.length;
//        for(int i=0; i<n; i++){
//            if(i>0 && nums[i]==nums[i-1]) continue;
//            int left = i+1;
//            int right = n-1;
//            while(left<right){
//                //if sum is smaller than 0, increase left
//                int sum = nums[i]+nums[left]+nums[right];
//                if(sum<0){
//                    left++;
//                }else if(sum>0){
//                    right--;
//                }
//                else{
//                    List<Integer> temp = new ArrayList<>();
//                    temp.add(nums[i]);
//                    temp.add(nums[left]);
//                    temp.add(nums[right]);
//                    ans.add(temp);
//                    while(left<right && nums[left]==nums[left+1]){
//                        left++;
//                    }
//                    while(left<right && nums[right]==nums[right-1]){
//                        right--;
//                    }
//                    left++;
//                    right--;
//                }
//            }
//        }
//        return ans;
//    }
//}
//
//
//// class Solution {
////     public List<List<Integer>> threeSum(int[] nums) {
////         List<List<Integer>> ans = new ArrayList<>();
////         int n = nums.length;
////         for(int i=0; i<n; i++){
////             for(int j=i+1; j<n; j++){
////                 for(int k=j+1; k<n; k++){
////                     if(nums[i]+nums[j]+nums[k]==0){
////                         List<Integer> temp = new ArrayList<>();
////                         temp.add(nums[i]);
////                         temp.add(nums[j]);
////                         temp.add(nums[k]);
////                         Collections.sort(temp);
////                         if(!ans.contains(temp)){
////                             ans.add(temp);
////                         }
////                     }
////                 }
////             }
////         }
////         return ans;
////     }
//// }