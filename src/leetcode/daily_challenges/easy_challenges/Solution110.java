package leetcode.daily_challenges.easy_challenges;

import explore.helper.TreeNode;

public class Solution110 {

  public static void main(String[] args) {
    TreeNode left = new TreeNode(9);
    TreeNode right = new TreeNode(20);
    TreeNode root = new TreeNode(3, left, right);
    TreeNode left1 = new TreeNode(15);
    TreeNode right1 = new TreeNode(7);
    right.left = left1;
    right.right = right1;
    System.out.println(isBalanced(root));
  }

  public static boolean isBalanced(TreeNode root) {
    return treeHeightBalance(root) >= 0;
  }

  private static int treeHeightBalance(TreeNode node) {
    if (node == null) return 0;

    int left = treeHeightBalance(node.left);
    int right = treeHeightBalance(node.right);

    if(left == -1 || right == -1 || Math.abs(left - right) > 1){
      return -1;
    } else {
      return Math.max(left, right) + 1;
    }
  }
}
