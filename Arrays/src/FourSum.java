public class FourSum {
}

//https://leetcode.com/problems/4sum/

//class Solution {
//    public List<List<Integer>> fourSum(int[] nums, int target) {
//        List<List<Integer>> ans = new ArrayList<>();
//        Arrays.sort(nums);
//        int n = nums.length;
//        for(int i=0; i<n-3; i++){
//            if(i>0 && nums[i]==nums[i-1])continue;
//            for(int i2=i+1; i2<n-2; i2++){
//                if(i2>i+1 && nums[i2]==nums[i2-1])continue;
//
//                int j = i2+1;
//                int k = n-1;
//
//                while(j<k){
//                    long sum = (long) nums[i]+nums[i2]+nums[j]+nums[k];
//                    if(sum<target){
//                        j++;
//                    }else if(sum>target){
//                        k--;
//                    }else{
//                        List<Integer> temp = new ArrayList<>();
//                        temp.add(nums[i]);
//                        temp.add(nums[i2]);
//                        temp.add(nums[j]);
//                        temp.add(nums[k]);
//                        ans.add(temp);
//                        while(j<k && nums[j]==nums[j+1]) j++;
//                        while(j<k && nums[k]==nums[k-1]) k--;
//                        j++;
//                        k--;
//                    }
//                }
//            }
//        }
//        return ans;
//    }
//}
//
//
//
//
//
//
//// class Solution {
////     public List<List<Integer>> fourSum(int[] nums, int target) {
////         List<List<Integer>> ans = new ArrayList<>();
////         int n = nums.length;
////         for(int i=0; i<n; i++){
////             for(int j=i+1; j<n; j++){
////                 for(int k=j+1; k<n; k++){
////                     for(int l=k+1; l<n; l++){
////                         if(nums[i]+nums[j]+nums[k]+nums[l]==target){
////                             List<Integer> temp = new ArrayList<>();
////                             temp.add(nums[i]);
////                             temp.add(nums[j]);
////                             temp.add(nums[k]);
////                             temp.add(nums[l]);
////                             Collections.sort(temp);
////                             if(!ans.contains(temp)){
////                                 ans.add(temp);
////                             }
////                         }
////                     }
////                 }
////             }
////         }
////         return ans;
////     }
//// }