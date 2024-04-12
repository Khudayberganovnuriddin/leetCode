package leetcode.daily_challenges.easy_challenges;

public class SearchInsertPosition {

  public static int searchInsert(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;
    while (low <= high) {
      int midPoint = low + ((high - low) / 2);
      if (nums[midPoint] == target) {
        return midPoint; // the target is found, return its index
      } else if (nums[midPoint] > target) {
        high = midPoint - 1; // target is smaller, go left
      } else {
        low = midPoint + 1; // target is larger, go right
      }
    }
    return low; // target not found, return where it would be
  }
}
