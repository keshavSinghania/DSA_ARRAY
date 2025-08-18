public class PascalTriangle {
}

//import java.util.*;
//
//class Solution {
//    public List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> result = new ArrayList<>();
//
//        for (int n = 0; n < numRows; n++) {
//            List<Integer> row = new ArrayList<>();
//            long ans = 1;
//            for (int col = 0; col <= n; col++) {
//                row.add((int) ans);
//                ans = ans * (n - col) / (col + 1);
//            }
//            result.add(row);
//        }
//
//        return result;
//    }
//}
