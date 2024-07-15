package leetcode.top_interview_questions.array;

import java.util.Arrays;

public class IntersectionsOfTwoArrays {

  private static final String NO_INTERSECTION = "false";

  public static void main(String[] args) {
//    System.out.println(findIntersection(new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"}));
    System.out.println(findIntersection(new String[]{"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"}));
  }

  private static int[] convertStringToArray(String str) {
    return Arrays.stream(str.split(","))
        .map(String::trim)
        .mapToInt(Integer::parseInt)
        .toArray();
  }

  public static String findIntersection(String[] strArr) {
    int[] firstArr = convertStringToArray(strArr[0]);
    int[] secArr = convertStringToArray(strArr[1]);
    int[] res = intersect(firstArr, secArr);
    return res.length == 0 ? NO_INTERSECTION : Arrays.toString(res);
  }

  public static int[] intersect(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);

    int i = 0, j = 0, k = 0;
    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] < nums2[j]) {
        i++;
      } else if (nums1[i] > nums2[j]) {
        j++;
      } else {
        nums1[k++] = nums1[i++];
        j++;
      }
    }
    return Arrays.copyOfRange(nums1, 0, k);
  }
}
