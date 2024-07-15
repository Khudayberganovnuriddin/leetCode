package leetcode.arrays_101.valid_mountain;

public class ValidMountain {

  public boolean validMountainArray(int[] arr) {
    int n = arr.length;
    int i = 0;

    i = ascendMountain(arr, n, i);
    if (i == 0 || i == n - 1) {
      return false;
    }
    i = descendMountain(arr, n, i);

    return i == n - 1;
  }

  private int ascendMountain(int[] arr, int n, int i) {
    while (i + 1 < n && arr[i] < arr[i + 1]) {
      i++;
    }
    return i;
  }

  private int descendMountain(int[] arr, int n, int i) {
    while (i + 1 < n && arr[i] > arr[i + 1]) {
      i++;
    }
    return i;
  }
}
