package leetcode.arrays_101.height_checker;

import java.util.Arrays;

public class HeightChecker {

  public int heightChecker(int[] heights) {
    int[] expected = sortHeightArray(heights);
    return countHeightDifferences(heights, expected);
  }

  private int[] sortHeightArray(int[] heights) {
    int[] expected = heights.clone();
    Arrays.sort(expected);
    return expected;
  }

  private int countHeightDifferences(int[] heights, int[] expected) {
    int count = 0;
    for (int i = 0; i < heights.length; i++) {
      if (expected[i] != heights[i]) {
        count++;
      }
    }
    return count;
  }
}
