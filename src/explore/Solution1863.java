package explore;

/**
 * @author Khudayberganov Nuriddin
 * @since : 09/09/23 / 9:32 AM
 */
public class Solution1863 {

  public int calculateTotalXorSum(int[] nums) {
    return findXorSum(nums, 0, 0);
  }

  private int findXorSum(int[] nums, int currentIndex, int resultSoFar) {
    if (currentIndex == nums.length) {
      return resultSoFar;
    }

    // recursive call includes the xor of current number
    int withCurrentNumber = findXorSum(nums, currentIndex + 1, nums[currentIndex] ^ resultSoFar);

    // recursive call excludes the xor of current number
    int withoutCurrentNumber = findXorSum(nums, currentIndex + 1, resultSoFar);

    // Sum of withCurrentNumber and withoutCurrentNumber results in creation of all possible subsets
    return withCurrentNumber + withoutCurrentNumber;
  }
}
