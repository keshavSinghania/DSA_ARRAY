public class FindSecondLargest {
}

//https://www.geeksforgeeks.org/problems/second-largest3735/1

//class Solution {
//    public int getSecondLargest(int[] arr) {
//        // EDGE CASE
//        if(arr.length == 1) return arr[0];
//        int largest = -1;
//        int secLargest = -1;
//
//        for(int i =0; i<arr.length; i++){
//            if(largest<arr[i]){
//                secLargest = largest;
//                largest = arr[i];
//            }else if(secLargest < arr[i] && largest > arr[i]){
//                secLargest = arr[i];
//            }
//        }
//        return secLargest;
//    }
//}