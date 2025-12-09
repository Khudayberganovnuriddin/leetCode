package leetcode.daily_challenges.easy_challenges;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Khudayberganov Nuriddin
 * @since : 16/11/25 / 16:51
 */
public class Solution2138 {

  public String[] divideString(String s, int k, char fill) {
    List<String> result = new ArrayList<>();
    int l = s.length();
    int curr = 0;
    while (curr < l) {
      int end = Math.min(curr + k, l);
      result.add(s.substring(curr, end));
      curr += k;
    }

    String last = result.get(result.size() - 1);
    if (last.length() < k) {
      last += String.valueOf(fill).repeat(k - last.length());
      result.set(result.size() - 1, last);
    }
    return result.toArray(new String[0]);
  }
}
