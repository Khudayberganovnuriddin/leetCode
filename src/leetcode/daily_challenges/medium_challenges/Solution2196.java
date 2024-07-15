package leetcode.daily_challenges.medium_challenges;

import explore.helper.TreeNode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution2196 {

  public static void main(String[] args) {
    int[][] arr = {{20, 15, 1}, {20, 17, 0}, {50, 20, 1}, {50, 80, 0}, {80, 19, 1}};
    TreeNode root = createBinaryTree(arr);
  }

  public static TreeNode createBinaryTree(int[][] descriptions) {
    Map<Integer, TreeNode> nodes = new HashMap<>();
    Set<Integer> children = new HashSet<>();

    for (int[] description : descriptions) {
      TreeNode parentNode = createOrGetNode(nodes, description[0]);
      TreeNode childNode = createOrGetNode(nodes, description[1]);

      if (description[2] == 1) {
        parentNode.left = childNode;
      } else {
        parentNode.right = childNode;
      }
      children.add(description[1]);
    }

    return findRoot(nodes, children);
  }

  private static TreeNode createOrGetNode(Map<Integer, TreeNode> nodes, int value) {
    nodes.putIfAbsent(value, new TreeNode(value));
    return nodes.get(value);
  }

  private static TreeNode findRoot(Map<Integer, TreeNode> nodes, Set<Integer> children) {
    for (int nodeValue : nodes.keySet()) {
      if (!children.contains(nodeValue)) {
        return nodes.get(nodeValue);
      }
    }
    return null;
  }
}
