package leetcode.daily_challenges.easy_challenges;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Khudayberganov Nuriddin
 * @since : 19/07/24 / 17:08
 */
public class Solution1380 {

  public List<Integer> luckyNumbers(int[][] matrix) {
    List<Integer> res = new ArrayList<>();

    for (int i = 0; i < matrix.length; i++) {
      int col = findMin(matrix, i);

      int maxCol = matrix[i][col];
      if (maxInCol(matrix, maxCol, col)) {
        res.add(maxCol);
      }
    }

    return res;
  }

  private int findMin(int[][] matrix, int row) {
    int val = matrix[row][0], col = 0;
    for (int i = 1; i < matrix[row].length; i++) {
      if (matrix[row][i] < val) {
        val = matrix[row][i];
        col = i;
      }
    }
    return col;
  }

  private boolean maxInCol(int[][] matrix, int val, int col) {
    for (int[] ints : matrix) {
      if (ints[col] > val) {
        return false;
      }
    }
    return true;
  }

}
