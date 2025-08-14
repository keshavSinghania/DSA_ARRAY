public class LeadersInArray {
}

//https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1

//class Solution {
//    static ArrayList<Integer> leaders(int arr[]) {
//        // code here
//        ArrayList<Integer> leaderList = new ArrayList<>();
//        for(int i=0 ; i<arr.length; i++){
//            boolean isLeader = true;
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i]<arr[j]){
//                    isLeader = false;
//                }
//            }
//            if(isLeader){
//                leaderList.add(arr[i]);
//            }
//        }
//        return leaderList;
//    }
//}

//solution 2

//class Solution {
//    static ArrayList<Integer> leaders(int arr[]) {
//        ArrayList<Integer> leaderList = new ArrayList<>();
//        int n = arr.length;
//        int maxRight = arr[n-1];
//        leaderList.add(maxRight);
//
//        for(int i=n-2; i>=0; i--){
//            if(arr[i]>=maxRight){
//                leaderList.add(arr[i]);
//                maxRight = arr[i];
//            }
//        }
//        Collections.reverse(leaderList);
//        return leaderList;
//    }
//}
