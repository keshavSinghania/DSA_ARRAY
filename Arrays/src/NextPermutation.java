public class NextPermutation {
}
//class Solution {
//    public void nextPermutation(int[] nums) {
//        int cutIndex = -1;
//        for(int i=nums.length-2; i>=0; i--){
//            if(nums[i]<nums[i+1]){
//                cutIndex = i;
//                break;
//            }
//        }
//        if(cutIndex == -1){
//            reverse(nums,0);
//            return;
//        }
//
//        //find the smallest greater number than nums[cutIndex] i.e right side , if found swap
//        for(int i = nums.length-1; i>=0; i--){
//            if(nums[cutIndex]<nums[i]){
//                swap(nums,cutIndex,i);
//                break;
//            }
//        }
//        //now arrange others in sorted array
//        reverse(nums,cutIndex+1);
//    }
//
//    //function to swap
//    void swap(int[] arr, int a, int b){
//        int temp = arr[b];
//        arr[b] = arr[a];
//        arr[a] = temp;
//    }
//
//    //function to reverse
//    void reverse(int[] arr, int start){
//        int end = arr.length - 1;
//        while(start<end){
//            swap(arr,start,end);
//            start++;
//            end--;
//        }
//    }
//}