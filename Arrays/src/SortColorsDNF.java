public class SortColorsDNF {
}

//https://leetcode.com/problems/sort-colors/
//.../
//class Solution {
//    public void sortColors(int[] nums) {
//        int start = 0;
//        int end = nums.length - 1;
//        int mid =0;
//        while(mid <= end){
//            if(nums[mid]==0){
//                swap(nums,mid,start);
//                mid++;
//                start++;
//            }else if(nums[mid]==1){
//                mid++;
//            }else{
//                swap(nums,mid,end);
//                end--;
//            }
//        }
//    }
//
//    //function to swap the element in an array
//    void swap(int[]arr, int a, int b){
//        int temp = arr[a];
//        arr[a]=arr[b];
//        arr[b]=temp;
//    }
//}