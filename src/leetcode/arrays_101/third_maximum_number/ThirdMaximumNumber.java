package leetcode.arrays_101.third_maximum_number;

import java.util.TreeSet;

public class ThirdMaximumNumber {

  private static void addNumberToSet(TreeSet<Integer> set, int num) {
    if (set.size() < 3) {
      set.add(num);
    } else if (set.first() < num && !set.contains(num)) {
      set.pollFirst();
      set.add(num);
    }
  }

  public static int thirdMax(int[] nums) {
    TreeSet<Integer> set = new TreeSet<>();
    for (int num : nums) {
      addNumberToSet(set, num);
    }
    return set.size() == 3 ? set.first() : set.last();
  }
}
