package algorithm;

public class ManachersAlgo {

  private static final char START_CHAR = '@';
  private static final char SEPARATOR_CHAR = '#';
  private static final char END_CHAR = '$';

  public static void main(String[] args) {
    System.out.println(longestPalindrome("abacaba"));
  }

  public static String longestPalindrome(String text) {
    char[] sChars = preparePalindromeChars(text);
    int maxLen = 0;
    int start = 0;
    int maxRight = 0;
    int center = 0;
    int[] radiusArray = new int[sChars.length];

    for (int i = 1; i < sChars.length - 1; i++) {

      if (i < maxRight) {
        radiusArray[i] = Math.min(maxRight - i, radiusArray[2 * center - i]);
      }

      while (sChars[i + radiusArray[i] + 1] == sChars[i - radiusArray[i] - 1]) {
        radiusArray[i]++;
      }

      if (i + radiusArray[i] > maxRight) {
        center = i;
        maxRight = i + radiusArray[i];
      }

      if (radiusArray[i] > maxLen) {
        start = (i - radiusArray[i] - 1) / 2;
        maxLen = radiusArray[i];
      }
    }
    return text.substring(start, start + maxLen);
  }

  private static char[] preparePalindromeChars(String text) {
    int processedStrLen = 2 * text.length() + 3;
    char[] sChars = new char[processedStrLen];
    sChars[0] = START_CHAR;
    sChars[processedStrLen - 1] = END_CHAR;
    int charIndex = 1;

    for (char c : text.toCharArray()) {
      sChars[charIndex++] = SEPARATOR_CHAR;
      sChars[charIndex++] = c;
    }
    sChars[charIndex] = SEPARATOR_CHAR;

    return sChars;
  }
}
