package leetcode.daily_challenges.medium_challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Solution2191 {

  public static void main(String[] args) {
    var arr = sortJumbled(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
        new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
    var arr1 = sortJumbled(new int[]{8, 9, 4, 0, 2, 1, 3, 5, 7, 6},
        new int[]{991, 338, 38});
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  public static int[] sortJumbled(int[] mapping, int[] nums) {
    Pair[] pairs = new Pair[nums.length];
    for (int i = 0; i < nums.length; i++) {
      pairs[i] = new Pair(nums[i], mapNumb(mapping, nums[i]));
    }
    Arrays.sort(pairs, Comparator.comparingInt(val -> val.index));
    for (int i = 0; i < nums.length; i++) {
      nums[i] = pairs[i].val;
    }
    return nums;
  }

  private static int mapNumb(int[] mapping, int num) {
    int mappedNumber = 0;
    int place = 1;
    if (num == 0) {
      return Arrays.asList(mapping).indexOf(num);
    }
    while (num >= 0) {
      int digit = num % 10;
      int indexInMap = Arrays.asList(mapping).indexOf(digit);
      mappedNumber += indexInMap * place;
      place *= 10;
      num /= 10;
    }
    return mappedNumber;
  }

  public static class Pair {

    int val;
    int index;

    public Pair(int val, int index) {
      this.val = val;
      this.index = index;
    }
  }
}
