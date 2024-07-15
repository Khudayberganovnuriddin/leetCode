package leetcode.arrays_101.remove_duplicates;

public class DuplicateRemover {

  public int removeDuplicateElements(int[] elements) {
    if (elements.length == 0) {
      return 0;
    }
    int distinctCount = 0;
    for (int currentIndex = 0; currentIndex < elements.length; currentIndex++) {
      if (elements[distinctCount] != elements[currentIndex]) {
        distinctCount++;
        elements[distinctCount] = elements[currentIndex];
      }
    }
    return distinctCount + 1;
  }
}
