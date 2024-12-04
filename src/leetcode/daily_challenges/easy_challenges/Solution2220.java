package leetcode.daily_challenges.easy_challenges;

/**
 * @author Khudayberganov Nuriddin
 * @since : 11/09/24 / 16:04
 */
public class Solution2220 {

  static int minBitFlips(int start, int goal) {
    return Integer.bitCount(start ^ goal);
  }
}
