package leetcode.top_interview_questions.strings;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharInString {

  public static int firstUniqChar(String s) {
    char[] arr = s.toCharArray();
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      if (map.containsKey(s.charAt(i))) {
        map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
      } else {
        map.put(s.charAt(i), 1);
      }
    }

    for (int j = 0; j < arr.length; j++) {
      if (map.get(s.charAt(j)) == 1) {
        return j;
      }
    }
    return -1;
  }
}
