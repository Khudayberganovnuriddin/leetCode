package explore;

/**
 * @author Khudayberganov Nuriddin
 * @since : 09/09/23 / 9:32 AM
 */
public class Solution1863 {
  public int subsetXORSum(int[] nums) {
    return xorSum(nums, 0, 0);
  }

  private int xorSum(int[] nums, int idx, int res) {
    if (idx == nums.length) return res;
    int inner = xorSum(nums, idx + 1, nums[idx] ^ res);
    int outer = xorSum(nums, idx + 1, res);
    return inner + outer;
  }
}
