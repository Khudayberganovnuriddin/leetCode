package leetcode.daily_challenges.easy_challenges;

import explore.helper.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Solution145 {

  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> ans = new ArrayList<>();
    traverse(root, ans);
    return ans;
  }

  private void traverse(TreeNode root, List<Integer> ans) {
    if (root == null) {
      return;
    }
    traverse(root.left, ans);
    traverse(root.right, ans);
    ans.add(root.val);
  }

}
