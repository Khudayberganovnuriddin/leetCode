package leetcode.daily_challenges.medium_challenges;

import explore.helper.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Solution1110 {

  private boolean[] holder = new boolean[1001];
  private List<TreeNode> ans = new ArrayList<>();

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(4);
    root.left.left = new TreeNode(3);
//    root.right.left = new TreeNode(6);
//    root.right.right = new TreeNode(4);
//    List<TreeNode> treeNodes = delNodes(root, new int[]{3});
//    System.out.println(treeNodes);
  }

  public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
    for (int i : to_delete) {
      holder[i] = true;
    }
    if (dfs(root) != null) {
      ans.add(root);
    }
    return ans;
  }

  private TreeNode dfs(TreeNode node) {
    if (node == null) {
      return null;
    }

    node.left = dfs(node.left);
    node.right = dfs(node.right);

    if (!holder[node.val]) {
      return node;
    }
    if (node.left != null) {
      ans.add(node.left);
    }
    if (node.right != null) {
      ans.add(node.right);
    }

    return null;
  }

//  private static TreeNode removeNodes(TreeNode node, Set<Integer> delNode, List<TreeNode> ans) {
//    if (node == null) {
//      return null;
//    }
//    node.left = removeNodes(node.left, delNode, ans);
//    node.right = removeNodes(node.right, delNode, ans);
//
//    if (delNode.contains(node.val)) {
//      if (node.left != null) {
//        ans.add(node.left);
//      }
//      if (node.right != null) {
//        ans.add(node.right);
//      }
//      return null;
//    }
//
//    return node;
//  }
}
