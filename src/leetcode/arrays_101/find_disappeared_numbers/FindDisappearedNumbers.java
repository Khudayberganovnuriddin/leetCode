package leetcode.arrays_101.find_disappeared_numbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDisappearedNumbers {

  private static Set<Integer> initializeSet(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      set.add(num);
    }
    return set;
  }

  private static List<Integer> findMissingNumbers(int[] nums, Set<Integer> set) {
    List<Integer> result = new ArrayList<>();
    for (int i = 1; i <= nums.length; i++) {
      if (!set.contains(i)) {
        result.add(i);
      }
    }
    return result;
  }

  public static List<Integer> findDisappearedNumbers(int[] nums) {
    Set<Integer> set = initializeSet(nums);
    return findMissingNumbers(nums, set);
  }
}
