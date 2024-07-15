package leetcode.arrays_101.move_zeros;

import java.util.Arrays;

public class MoveZeros {

  public static void moveZeroes(int[] nums) {
    int position = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[position] = nums[i];
        nums[i] = nums[position++];
      }
    }
    printArray(nums);
  }

  private static void printArray(int[] nums) {
    System.out.println(Arrays.toString(nums));
  }
}
