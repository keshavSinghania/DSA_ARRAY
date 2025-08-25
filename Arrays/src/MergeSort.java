public class MergeSort {
}

//https://leetcode.com/problems/sort-an-array/dd .

//
//class Solution {
//    public int[] sortArray(int[] nums) {
//        mergeSort(nums,0,nums.length-1);
//        return nums;
//    }
//
//    //merge sort function
//    void mergeSort(int[] nums, int start, int end){
//        if(start==end) return;
//        int mid = start+(end-start)/2;
//        mergeSort(nums, start, mid);
//        mergeSort(nums, mid+1, end);
//        merge(nums, start, mid, end);
//    }
//
//    //function to merge
//    void merge(int []nums, int start, int mid, int end){
//        int index=0;
//        int originalStart=start;
//        int mid2=mid+1;
//        int[] temp = new int[end-start + 1];
//        while(start<=mid && mid2<=end){
//            //if start is greater than end ,then increase start and put start..
//            if(nums[start]<=nums[mid2]){
//                temp[index] = nums[start];
//                index++;
//                start++;
//            }else{
//                temp[index] = nums[mid2];
//                mid2++;
//                index++;
//            }
//        }
//
//        //if left having some elements add that
//        while(start<=mid){
//            temp[index] = nums[start];
//            start++;
//            index++;
//        }
//
//        //if right having some elements add that
//        while(mid2<=end){
//            temp[index] = nums[mid2];
//            mid2++;
//            index++;
//        };
//
//        //now we have sorted array in temp
//        for(int i=0; i<temp.length; i++){
//            nums[originalStart+i] = temp[i];
//        }
//    }
//}