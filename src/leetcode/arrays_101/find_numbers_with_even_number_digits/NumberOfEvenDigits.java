package leetcode.arrays_101.find_numbers_with_even_number_digits;

public class NumberOfEvenDigits {

  public int findNumbers(int[] nums) {
    int result = 0;
    for (int num : nums) {
      if (countDigits(num) % 2 == 0) {
        result++;
      }
    }
    return result;
  }

  private int countDigits(int num) {
    int count = 0;
    while (num != 0) {
      num = num / 10;
      count++;
    }
    return count;
  }
}
