package leetcode.arrays_101.check_its_double_exist;

import java.util.HashSet;
import java.util.Set;

public class CheckIfDoubleExists {

  public static boolean doesDoubleExist(int[] arr) {
    Set<Integer> processedElements = new HashSet<>();
    for (int i : arr) {
      if (processedElements.contains(i * 2) || (i % 2 == 0 && processedElements.contains(i / 2))) {
        return true;
      }
      processedElements.add(i);
    }
    return false;
  }
}
