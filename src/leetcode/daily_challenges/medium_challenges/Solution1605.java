package leetcode.daily_challenges.medium_challenges;

/**
 * @author Khudayberganov Nuriddin
 * @since : 20/07/24 / 21:05
 */
public class Solution1605 {

  public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
    int m = rowSum.length;
    int n = colSum.length;
    int[][] row = new int[m][n];

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        row[i][j] = Math.min(rowSum[i], colSum[j]);
        rowSum[i] -= row[i][j];
        colSum[j] -= row[i][j];
      }
    }
    return row;
  }

}
