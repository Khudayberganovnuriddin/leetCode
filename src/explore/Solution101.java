package explore;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */

public class Solution101 {

  public boolean isSymmetric(TreeNode root) {
    return root == null || checkSymmetric(root.left, root.right);
  }

  public boolean checkSymmetric(TreeNode left, TreeNode right) {
    if (left == null || right == null) {
      return left == right;
    }
    if (left.val != right.val) {
      return false;
    }

    boolean outerNodesSymmetry = checkSymmetric(left.left, right.right);
    boolean innerNodesSymmetry = checkSymmetric(left.right, right.left);

    return outerNodesSymmetry && innerNodesSymmetry;
  }
}
