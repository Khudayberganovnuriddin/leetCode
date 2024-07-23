package leetcode.daily_challenges.easy_challenges;

public class Solution2418 {

  // T(O) = 1ms
  private <T> void swapElements(int[] mainArray, T[] sideArray, int index1, int index2) {
    int tempMain = mainArray[index1];
    mainArray[index1] = mainArray[index2];
    mainArray[index2] = tempMain;

    T tempSide = sideArray[index1];
    sideArray[index1] = sideArray[index2];
    sideArray[index2] = tempSide;
  }

  private <T> void insertionSortReverseOrder(int[] main, T[] side, int left, int right) {
    for (int i = left + 1; i <= right; i++) {
      for (int j = i - 1; j >= 0; j--) {
        if (main[j + 1] > main[j]) {
          swapElements(main, side, j + 1, j);
        } else {
          break;
        }
      }
    }
  }

  private <T> void quickSortReverseOrder(int[] main, T[] side, int left, int right) {
    if (left >= right) {
      return;
    }
    if (right - left <= 11) {
      insertionSortReverseOrder(main, side, left, right);
      return;
    }

    int pivot = calculatePivot(main, left);

    swapElements(main, side, pivot, right);

    int L = left, R = right - 1;
    while (true) {
      while (L <= R && main[L] >= main[right]) {
        L++;
      }
      while (L <= R && main[R] <= main[right]) {
        R--;
      }
      if (L < R) {
        swapElements(main, side, L, R);
        L++;
        R--;
      } else {
        break;
      }
    }

    swapElements(main, side, L, right);

    quickSortReverseOrder(main, side, left, L - 1);
    quickSortReverseOrder(main, side, L + 1, right);
  }

  private int calculatePivot(int[] main, int left) {
    int aV = main[left], bV = main[left + 1], cV = main[left + 2];
    if (aV <= bV && aV <= cV) {
      return bV <= cV ? (left + 1) : (left + 2);
    } else if (bV <= aV && bV <= cV) {
      return aV <= cV ? (left) : (left + 2);
    } else {
      return aV <= bV ? (left) : (left + 1);
    }
  }
  // *****

  public String[] sortPeople(String[] names, int[] heights) {
    quickSortReverseOrder(heights, names, 0, names.length - 1);
    return names;
  }

//  T(O) = 22ms
//  ************
//  public String[] sortPeople(String[] names, int[] heights) {
//    for (int i = 0; i < heights.length; i++) {
//      for (int j = i + 1; j < heights.length; j++) {
//        if (heights[i] < heights[j]) {
//          int temp = heights[i];
//          heights[i] = heights[j];
//          heights[j] = temp;
//          String tempName = names[i];
//          names[i] = names[j];
//          names[j] = tempName;
//        }
//      }
//    }
//    return names;
//  }

}
