package explore;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Khudayberganov Nuriddin
 * @since : 07/09/23 / 9:14 PM
 */
public class Solution17 {

  private static final String[] LETTER_MAPPINGS =
      {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

  public static void main(String[] args) {
    List<String> combinations = letterCombinations("23");
    System.out.println(combinations);
  }

  public static List<String> letterCombinations(String digits) {
    List<String> result = new ArrayList<>();
    if (digits == null || digits.isEmpty()) {
      return result;
    }
    combineLetters(result, new StringBuilder(), digits, 0);
    return result;
  }

  private static void combineLetters(List<String> results, StringBuilder combination,
      String digits, int index) {
    if (index == digits.length()) {
      results.add(combination.toString());
      return;
    }
    int digitValue = digits.charAt(index) - '0';
    String currentLetters = LETTER_MAPPINGS[digitValue - 2];
    for (int letterIndex = 0; letterIndex < currentLetters.length(); letterIndex++) {
      combination.append(currentLetters.charAt(letterIndex));
      combineLetters(results, combination, digits, index + 1);
      combination.deleteCharAt(combination.length() - 1);
    }
  }
}
