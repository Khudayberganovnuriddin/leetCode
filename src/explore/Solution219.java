package explore;

import java.util.HashSet;
import java.util.Set;

public class Solution219 {

  public static void main(String[] args) {
    boolean hasNearbyDuplicate = containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 3);
    System.out.println(hasNearbyDuplicate);
  }

  /**
   * This method checks if the array contains any duplicates within 'k' distance from each other
   *
   * @param nums the array to check for duplicates
   * @param k    the maximum distance for two identical elements to be considered duplicates
   * @return true if any two identical elements are at most 'k' distance apart
   */
  public static boolean containsNearbyDuplicate(int[] nums, int k) {
    Set<Integer> uniqueNumsWithinDistanceK = new HashSet<>();

    for (int i = 0; i < nums.length; i++) {
      // As we are maintaining 'k' distance window, remove the 'i-k-1' element from set
      if (i > k) {
        uniqueNumsWithinDistanceK.remove(nums[i - k - 1]);
      }

      // If adding the current number to the set returns false, it means a duplicate was found.
      if (!uniqueNumsWithinDistanceK.add(nums[i])) {
        return true;
      }
    }

    return false; // return false if no duplicates were found
  }
}
