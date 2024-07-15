package leetcode.daily_challenges.easy_challenges;

import explore.helper.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Solution144 {

  public static void main(String[] args) {

  }

  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    traverse(res, root);
    return res;
  }

  private void traverse(List<Integer> res, TreeNode root) {
    if (root != null) {
      res.add(root.val);
      traverse(res, root.left);
      traverse(res, root.right);
    }
  }
}
