package explore;

import java.util.ArrayList;
import java.util.List;

public class Solution438 {

  private static final int ALPHABET_SIZE = 26;

  public static void main(String[] args) {
    System.out.println(findAnagrams("abab", "ab"));
  }

  public static List<Integer> findAnagrams(String inputString, String pattern) {
    List<Integer> result = new ArrayList<>();
    if (pattern.length() > inputString.length()) {
      return result;
    }

    int[] freqInputString = new int[ALPHABET_SIZE];
    int[] freqPattern = new int[ALPHABET_SIZE];

    for (int i = 0; i < pattern.length(); i++) {
      freqInputString[inputString.charAt(i) - 'a']++;
      freqPattern[pattern.charAt(i) - 'a']++;
    }

    for (int i = 0; i <= inputString.length() - pattern.length(); i++) {
      if (isEqualFrequencies(freqInputString, freqPattern)) {
        result.add(i);
      }
      freqInputString[inputString.charAt(i) - 'a']--;
      if (i + pattern.length() < inputString.length()) {
        freqInputString[inputString.charAt(i + pattern.length()) - 'a']++;
      }
    }
    return result;
  }

  public static boolean isEqualFrequencies(int[] arrS, int[] arrP) {
    for (int j = 0; j < ALPHABET_SIZE; j++) {
      if (arrS[j] != arrP[j]) {
        return false;
      }
    }
    return true;
  }
}
