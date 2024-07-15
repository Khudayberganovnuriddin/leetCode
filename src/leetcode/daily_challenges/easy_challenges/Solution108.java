package leetcode.daily_challenges.easy_challenges;

import explore.helper.TreeNode;

public class Solution108 {

  public static void main(String[] args) {
    int[] arr = {-10, -3, 0, 5, 9};
    sortedArrayToBST(arr);
  }

  public static TreeNode sortedArrayToBST(int[] nums) {
    if (nums == null || nums.length == 0) {
      return null;
    }
    return constructBST(nums, 0, nums.length - 1);
  }

  private static TreeNode constructBST(int[] nums, int left, int right) {
    if (left > right) {
      return null;
    }

    int mid = left + (right - left) / 2;
    TreeNode node = new TreeNode(nums[mid]);
    node.left = constructBST(nums, left, mid - 1);
    node.right = constructBST(nums, mid + 1, right);
    return node;
  }
}
