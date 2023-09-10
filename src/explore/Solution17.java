package explore;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Khudayberganov Nuriddin
 * @since : 07/09/23 / 9:14 PM
 */
public class Solution17 {
  public static void main(String[] args) {
    List<String> l = letterCombinations("23");
    System.out.println(l);
  }

  public static List<String> letterCombinations(String digits) {
    List<String> result = new ArrayList<>();
    if (digits == null || digits.isEmpty()) return result;
    String[] letters = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    combine(result, new StringBuilder(), digits, letters, 0);
    return result;
  }

  private static void combine(List<String> res, StringBuilder sb,
                              String digits, String[] letters, int idx) {
    if (idx == digits.length()) {
      res.add(sb.toString());
      return;
    }

    int numb = digits.charAt(idx) - '0';
    String str = letters[numb - 2];
    for (int i = 0; i < str.length(); i++) {
      sb.append(str.charAt(i));
      combine(res, sb, digits, letters, idx + 1);
      sb.deleteCharAt(sb.length() - 1);
    }
  }
}
