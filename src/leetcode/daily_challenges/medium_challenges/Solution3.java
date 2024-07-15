package leetcode.daily_challenges.medium_challenges;

import java.util.HashSet;
import java.util.Set;

public class Solution3 {

  private static final int INITIAL_VALUE = 0;

  public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring("abcabcbb"));
  }

  public static int lengthOfLongestSubstring(String s) {
    int i = INITIAL_VALUE;
    int j = INITIAL_VALUE;
    int max = INITIAL_VALUE;
    Set<Character> set = new HashSet<>();

    while (j < s.length()) {
      if (!set.contains(s.charAt(j))) {
        set.add(s.charAt(j++));
        max = Math.max(max, set.size());
      } else {
        set.remove(s.charAt(i++));
      }
    }

    return max;
  }
}
