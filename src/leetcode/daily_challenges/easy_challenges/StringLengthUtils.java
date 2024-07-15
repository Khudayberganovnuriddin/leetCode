package leetcode.daily_challenges.easy_challenges;

public class StringLengthUtils {

  public static int getLengthOfLastNonNullWord(String s) {
    int i = s.length() - 1;

    i = skipTrailingSpaces(s, i);

    int length = 0;
    for (; i >= 0; i--) {
      if (s.charAt(i) != ' ') {
        length++;
      } else {
        return length;
      }
    }
    return length;
  }

  private static int skipTrailingSpaces(String s, int i) {
    while (i >= 0 && s.charAt(i) == ' ') {
      i--;
    }
    return i;
  }
}
