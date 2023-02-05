package explore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution438 {

  public static void main(String[] args) {
    System.out.println(findAnagrams("abab", "ab"));
  }

  public static List<Integer> findAnagrams(String s, String p) {
    List<Integer> res = new ArrayList<>();
    if (p.length() > s.length()) return res;

    int[] ars = new int[26];
    int[] arp = new int[26];

    for (int i = 0; i < p.length(); i++) {
      ars[s.charAt(i) - 'a']++;
      arp[p.charAt(i) - 'a']++;
    }
    for (int i = 0; i <= s.length() - p.length(); i++) {
      if (iszero(ars, arp)) {
        res.add(i);
      }
      ars[s.charAt(i) - 'a']--;
      if (i + p.length() < s.length()) {
        ars[s.charAt(i + p.length()) - 'a']++;
      }
    }
    return res;
  }

  public static boolean iszero(int[] arrs, int[] arrp) {
    for (int j = 0; j < 26; j++) {
      if (arrs[j] != arrp[j]) {
        return false;
      }
    }
    return true;
  }
}
