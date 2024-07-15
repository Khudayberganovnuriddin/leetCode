package explore;

import java.util.Arrays;

/**
 * Solution: 567
 */
public class StringUtils {

  public static boolean isPermutationSubstring(String original, String testString) {
    testString = sort(testString);
    int originalLength = original.length();

    for (int i = 0; i <= testString.length() - originalLength; i++) {
      if (testString.equals(sortedSubstring(testString, i, originalLength))) {
        return true;
      }
    }

    return false;
  }

  private static String sortedSubstring(String s, int start, int length) {
    String substring = s.substring(start, start + length);
    return sort(substring);
  }

  private static String sort(String s) {
    char[] sortedChars = s.toCharArray();
    Arrays.sort(sortedChars);
    return new String(sortedChars);
  }
}
