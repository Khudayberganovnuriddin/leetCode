package leetcode.daily_challenges.easy_challenges;

import explore.helper.TreeNode;

public class Solution111 {

  public static void main(String[] args) {
    TreeNode left = new TreeNode(9);
    TreeNode right = new TreeNode(20);
    TreeNode root = new TreeNode(3, left, right);
    TreeNode left1 = new TreeNode(15);
    TreeNode right1 = new TreeNode(7);
    right.left = left1;
    right.right = right1;
    System.out.println(minDepth(root));
  }

  public static int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }

    if (root.left == null) {
      return minDepth(root.right) + 1;
    }
    if (root.right == null) {
      return minDepth(root.left) + 1;
    }
    return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
  }
}
