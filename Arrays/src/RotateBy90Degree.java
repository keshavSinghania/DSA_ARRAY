public class RotateBy90Degree {
}

//https://leetcode.com/problems/rotate-image/
//class Solution {
//    public void rotate(int[][] matrix) {
//        transpose(matrix,matrix.length);
//        reverseRows(matrix);
//    }
//    //function to transpose the matrix
//    void transpose(int[][]arr, int n){
//        for(int i =0; i<n; i++){
//            for(int j=i+1; j<n; j++){
//                int temp = arr[i][j];
//                arr[i][j] = arr[j][i];
//                arr[j][i] = temp;
//            }
//        }
//    }
//
//    //function to reverse the row of matrix
//    static void reverseRows(int[][] matrix) {
//        for (int i = 0; i < matrix.length; i++) {
//            int left = 0, right = matrix[i].length - 1;
//            while (left < right) {
//                int temp = matrix[i][left];
//                matrix[i][left] = matrix[i][right];
//                matrix[i][right] = temp;
//                left++;
//                right--;
//            }
//        }
//    }
//
//}