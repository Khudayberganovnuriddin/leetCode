package explore;

public class Solution112 {

  public boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) {
      return false;
    }

    int remainingSum = targetSum - root.val;

    if (root.left == null && root.right == null && remainingSum == 0) {
      return true;
    } else {
      return hasPathSum(root.left, remainingSum) || hasPathSum(root.right, remainingSum);
    }
  }
}

