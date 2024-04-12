package leetcode.top_interview_questions.trees;

public class MaxDepthOfBinaryTree {

  public int maxDepth(TreeNode root) {
    return root == null ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
  }
}
