package leetcode.arrays_101.remove_duplicates;

public class DuplicateRemover {

  public int removeDuplicateElements(int[] elements) {
    if (elements.length == 0) {
      return 0;
    }
    int distinctCount = 0;
    for (int i = 0; i < elements.length; i++) {
      if (elements[distinctCount] != elements[i]) {
        distinctCount++;
        elements[distinctCount] = elements[i];
      }
    }
    return distinctCount + 1;
  }
}
