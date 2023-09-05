package explore;

import java.util.HashSet;
import java.util.Set;

public class Solution219 {
  public static void main(String[] args) {
    System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 3));
  }

  public static boolean containsNearbyDuplicate(int[] nums, int k) {
    Set<Integer> box = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (i > k) box.remove(nums[i - k - 1]);
      if (!box.add(nums[i])) return true;
    }
    return false;
  }
}
