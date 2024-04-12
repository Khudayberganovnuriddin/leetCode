package leetcode.arrays_101.greatest_number_on_right;

public class GreatestNumberOnRight {

  public static int[] replaceWithLargestToRight(int[] arr) {
    int maxToRight = -1;
    for (int i = arr.length - 1; i >= 0; i--) {
      int currentValue = arr[i];
      arr[i] = maxToRight;
      maxToRight = Math.max(currentValue, maxToRight);
    }
    return arr;
  }
}
