package leetcode.top_interview_questions.strings;

public class strStr {

  public static int strStr(String haystack, String needle) {
    for (int i = 0; ; i++) {
      for (int j = 0; ; j++) {
          if (j == needle.length()) {
              return i;
          }
          if (i + j == haystack.length()) {
              return -1;
          }
          if (needle.charAt(j) != haystack.charAt(i + j)) {
              break;
          }
      }
    }
  }
}
