package leetcode.problems.easy;

public class Solution202 {

  public static void main(String[] args) {

  }

  public boolean isHappy(int n) {
    int slow = n, fast = n;
    do {
      slow = findSquareSum(slow);
      fast = findSquareSum(findSquareSum(fast));
    } while (slow != fast);

    return slow == 1;
  }

  private int findSquareSum(int slow) {
    int sum = 0;
    while (slow > 0) {
      int digit = slow % 10;
      sum += digit * digit;
      slow /= 10;
    }
    return sum;
  }
}
