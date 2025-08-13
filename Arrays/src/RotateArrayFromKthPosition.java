public class RotateArrayFromKthPosition {
}


//https://leetcode.com/problems/rotate-array/

//class Solution {
//    public void rotate(int[] nums, int k) {
//
//        //reverse the whole array
//        int n = nums.length;
//
//        k = k % n; // case where user enter value of k > length of nums
//
//        //reverse the whole array
//        reverse(nums,0,n-1);
//
//        //reverse the kth elements
//        reverse(nums,0,k-1);
//
//        //reverse the elements that is (n-k)
//        reverse(nums,k,n-1);
//    }
//
//    //function to reverse array using Binary search
//    void reverse(int[] arr, int start, int end){
//        while(start<end){
//            int temp = arr[start];
//            arr[start]=arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//    }
}