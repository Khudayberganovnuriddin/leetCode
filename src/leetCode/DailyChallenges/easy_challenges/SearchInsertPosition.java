package leetCode.DailyChallenges.easy_challenges;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int min = 0, max = nums.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) max = mid - 1;
            else min = mid + 1;
        }
        return min;
    }
}
