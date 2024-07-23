package leetcode.daily_challenges.easy_challenges;

public class Solution1636 {

  public int[] frequencySort(int[] nums) {
    int[] count = new int[202];
    for (int num : nums) {
      count[num + 100]++;
    }
    quickSort(nums, count, 0, nums.length - 1);
    return nums;
  }

  void quickSort(int[] nums, int freq[], int low, int high) {
    if (low < high) {
      int pivot = partition(nums, freq, low, high);
      quickSort(nums, freq, low, pivot - 1);
      quickSort(nums, freq, pivot + 1, high);
    }
  }

  int partition(int[] nums, int[] freq, int low, int high) {
    int pivot = freq[nums[high] + 100];
    int i = low - 1;
    for (int j = low; j < high; j++) {
      if (pivot > freq[nums[j] + 100]) {
        i++;
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
      } else if (freq[nums[j] + 100] == pivot) {
        if (nums[high] <= nums[j]) {
          i++;
          int temp = nums[j];
          nums[j] = nums[i];
          nums[i] = temp;
        }
      }
    }
    int temp = nums[i + 1];
    nums[i + 1] = nums[high];
    nums[high] = temp;
    return i + 1;
  }

  // T(O) = 9ms
//  public static int[] frequencySort(int[] nums) {
//    int[] count = new int[201];
//    for (int num : nums) {
//      count[num + 100]++;
//    }
//
//    Integer[] boxedArray = Arrays.stream(nums).boxed().toArray(Integer[]::new);
//    Arrays.sort(boxedArray, (a, b) -> {
//      if (count[a + 100] == count[b + 100]) {
//        return b - a;
//      }
//      return count[a + 100] - count[b + 100];
//    });
//    return Arrays.stream(boxedArray).mapToInt(Integer::intValue).toArray();
//  }
}
