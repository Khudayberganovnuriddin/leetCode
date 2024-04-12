package leetcode.arrays_101.max_consecutive_ones;

public class MaxConsecutiveOnes {

  public int findMaxConsecutiveOnes(int[] nums) {
    int currentOnesCount = 0;
    int maxConsecutiveOnes = 0;

    for (int num : nums) {
      if (num == 0) {
        currentOnesCount = 0;
      } else {
        currentOnesCount++;
        maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentOnesCount);
      }
    }

    return maxConsecutiveOnes;
  }
}
