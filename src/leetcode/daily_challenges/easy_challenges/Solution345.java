package leetcode.daily_challenges.easy_challenges;

public class Solution345 {

  public String reverseVowels(String s) {
    String[] vowels = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
    char[] chars = s.toCharArray();
    int left = 0;
    int right = chars.length - 1;
    while (left < right) {
      boolean leftIsVowel = false;
      boolean rightIsVowel = false;
      for (String vowel : vowels) {
        if (vowel.equals(String.valueOf(chars[left]))) {
          leftIsVowel = true;
        }
        if (vowel.equals(String.valueOf(chars[right]))) {
          rightIsVowel = true;
        }
        if (leftIsVowel && rightIsVowel) {
          break;
        }
      }
      if (leftIsVowel && rightIsVowel) {
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;
        left++;
        right--;
      }
      if (!leftIsVowel) {
        left++;
      }
      if (!rightIsVowel) {
        right--;
      }
    }
    return new String(chars);
  }
}
