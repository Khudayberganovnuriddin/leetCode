package leetcode.daily_challenges.easy_challenges;

/**
 * @author Khudayberganov Nuriddin
 * @since : 17/10/24 / 14:46
 */
public class Solution2696 {

  public int minLength(String s) {
    while (s.contains("AB") || s.contains("CD")) {
      s = s.replaceAll("AB", "").replaceAll("CD", "");
    }
    return s.length();
  }

}
