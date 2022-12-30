package algorithm;

public class ManachersAlgo {
  public static void main(String[] args) {
    System.out.println(longestPalindrome("abacaba"));
  }

  public static String longestPalindrome(String text) {
    int strLen = 2 * text.length() + 3;
    char[] sChars = new char[strLen];

    sChars[0] = '@';
    sChars[strLen - 1] = '$';

    int t = 1;
    for (char c : text.toCharArray()) {
      sChars[t++] = '#';
      sChars[t++] = c;
    }
    sChars[t] = '#';

    int maxLen = 0;
    int start = 0;
    int maxRight = 0;
    int center = 0;
    int[] p = new int[strLen];                                  // i's radius, which not includes i
    for (int i = 1; i < strLen - 1; i++) {
      if (i < maxRight) {
        p[i] = Math.min(maxRight - i, p[2 * center - i]);
      }

      // expand center
      while (sChars[i + p[i] + 1] == sChars[i - p[i] - 1]) {
        p[i]++;
      }

      // update center and its bound
      if (i + p[i] > maxRight) {
        center = i;
        maxRight = i + p[i];
      }

      // update ans
      if (p[i] > maxLen) {
        start = (i - p[i] - 1) / 2;
        maxLen = p[i];
      }
    }
    return text.substring(start, start + maxLen);
  }
}
