package explore;

import java.util.Arrays;

public class Solution605 {
  public static void main(String[] args) {
    System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 0, 1}, 2));
  }

  public static boolean canPlaceFlowers(int[] flowerbed, int n) {
    int zeros = 1;
    int ans = 0;
    for (int i : flowerbed) {
      if (i == 0) {
        ++zeros;
      } else {
        ans += (zeros - 1) / 2;
        zeros = 0;
      }
    }
    return ans + zeros / 2 >= n;
  }
}
