package leetcode.problems.easy;

public class Solution205 {

  public static void main(String[] args) {

  }

  public boolean isIsomorphic(String s, String t) {
    for (int i = 0; i < s.length(); i++) {
      if (s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))) {
        return false;
      }
    }
    return true;
  }
}
