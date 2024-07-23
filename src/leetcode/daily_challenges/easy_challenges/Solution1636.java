package leetcode.daily_challenges.easy_challenges;

import java.util.Arrays;

public class Solution1636 {

  public static int[] frequencySort(int[] nums) {
    int[] count = new int[201];
    for (int num : nums) {
      count[num + 100]++;
    }

    Integer[] boxedArray = Arrays.stream(nums).boxed().toArray(Integer[]::new);
    Arrays.sort(boxedArray, (a, b) -> {
      if (count[a + 100] == count[b + 100]) {
        return b - a;
      }
      return count[a + 100] - count[b + 100];
    });
    return Arrays.stream(boxedArray).mapToInt(Integer::intValue).toArray();
  }
}
