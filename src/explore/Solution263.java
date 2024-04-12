package explore;

public class Solution263 {

  public static void main(String[] args) {
    System.out.println(isUgly(15));
  }

  public static boolean isUgly(int num) {
    for (int i = 2; i < 6 && num > 0; i++) {
      num = makeDivisible(num, i);
    }
    return num == 1;
  }

  private static int makeDivisible(int num, int divisor) {
    while (num % divisor == 0) {
      num /= divisor;
    }
    return num;
  }
}
