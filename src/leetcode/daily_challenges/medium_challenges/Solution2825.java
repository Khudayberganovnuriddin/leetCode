package leetcode.daily_challenges.medium_challenges;

/**
 * @author Khudayberganov Nuriddin
 * @since : 04/12/24 / 11:04
 */
public class Solution2825 {

  public static boolean canMakeSubsequence(String str1, String str2) {
    int j = 0, n = str1.length(), m = str2.length();
    for (int i = 0; i < n && j < m; i++) {
      char c1 = str1.charAt(i), c2 = str2.charAt(j);
      if (c1 == c2 || (c1 - 'a' + 1) % 26 + 'a' == c2) {
        j++;
      }
    }
    return j == m;
  }

}
