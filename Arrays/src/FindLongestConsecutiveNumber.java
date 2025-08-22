public class FindLongestConsecutiveNumber {
}

//https://www.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1

//class Solution {
//
//    // Function to return length of longest subsequence of consecutive integers.
//    public int longestConsecutive(int[] arr) {
//        //edge case
//        if(arr.length==0) return 0;
//
//        sorting(arr);
//        int count=1;
//        int maxCount = 1;
//        for(int i=0; i<arr.length-1; i++){
//            if(arr[i]+1==arr[i+1]){
//                count++;
//            }else if(arr[i]==arr[i+1]){
//                continue;
//            }else{
//                if(maxCount<count){
//                    maxCount=count;
//                }
//                count=1;
//            }
//        }
//        maxCount = Math.max(maxCount, count);
//        return maxCount;
//
//    }
//
//    //function to sort array
//    void sorting(int[] arr){
//        for(int i=0; i<arr.length; i++){
//            boolean swapped = false;
//            for(int j=0; j<arr.length-1-i;j++){
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j+1];
//                    arr[j+1] = arr[j];
//                    arr[j] = temp;
//                    swapped= true;
//                }
//            }
//            if(!swapped){
//                break;
//            }
//        }
//    }
//}