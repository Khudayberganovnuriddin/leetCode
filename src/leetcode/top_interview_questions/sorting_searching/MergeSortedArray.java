package leetcode.top_interview_questions.sorting_searching;

import java.util.Arrays;

public class MergeSortedArray {

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    if (n >= 0)
      System.arraycopy(nums2, 0, nums1, m, n);
    Arrays.sort(nums1);
  }
}
