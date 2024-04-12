package leetcode.arrays_101.sorted_squares;

import java.util.Arrays;

public class SortedSquares {

  public static int[] sortedSquares(int[] nums) {
    squareNumbers(nums);
    Arrays.sort(nums);
    return nums;
  }

  private static void squareNumbers(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      nums[i] = nums[i] * nums[i];
    }
  }
}
