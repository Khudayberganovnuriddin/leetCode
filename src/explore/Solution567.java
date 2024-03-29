package explore;

import java.util.Arrays;

public class Solution567 {
  public static void main(String[] args) {
    System.out.println(checkInclusion("ab","weofoibaof"));
  }

  public static boolean checkInclusion(String s1, String s2) {
    s1 = sort(s1);
    for (int i = 0; i <= s2.length() - s1.length(); i++) {
      if (s1.equals(sort(s2.substring(i, i + s1.length()))))
        return true;
    }
    return false;
  }

  public static String sort(String s) {
    char[] t = s.toCharArray();
    Arrays.sort(t);
    return new String(t);
  }
}
