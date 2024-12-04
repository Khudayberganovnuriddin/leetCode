package leetcode.daily_challenges.medium_challenges;

/**
 * @author Khudayberganov Nuriddin
 * @since : 17/10/24 / 14:52
 */
public class Solution670 {

  public static void main(String[] args) {
    int num = 2736;
    int result = maximumSwap(num);
    System.out.println("After swap, maximum valued number: " + result);
  }

  public static int maximumSwap(int num) {
    char[] digits = Integer.toString(num).toCharArray();
    int[] last = new int[10];

    for (int i = 0; i < digits.length; i++) {
      last[digits[i] - '0'] = i;
    }

    for (int i = 0; i < digits.length; i++) {
      for (int d = 9; d > digits[i] - '0'; d--) {
        if (last[d] > i) {
          char tmp = digits[i];
          digits[i] = digits[last[d]];
          digits[last[d]] = tmp;
          return Integer.parseInt(new String(digits));
        }
      }
    }
    return num;
  }

}
