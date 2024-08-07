package leetcode.top_interview_questions.trees;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidateBinarySearchTree {
  
  public boolean isValidBST(TreeNode root) {
    if (root == null) {
      return true;
    }
    Deque<TreeNode> stack = new ArrayDeque<>();
    TreeNode pre = null;
    while (root != null || !stack.isEmpty()) {
      while (root != null) {
        stack.push(root);
        root = root.left;
      }
      root = stack.pop();
      if (pre != null && root.val <= pre.val) {
        return false;
      }
      pre = root;
      root = root.right;
    }
    return true;
  }
}
