package leetcode.daily_challenges.medium_challenges;

import explore.helper.TreeNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Solution2096 {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
//    root.right = new TreeNode(2);
//    root.left.left = new TreeNode(3);
//    root.right.left = new TreeNode(6);
//    root.right.right = new TreeNode(4);
    String directions = getDirections(root, 2, 1);
    System.out.println(directions);
  }

  public static String getDirections(TreeNode root, int startValue, int destValue) {
    Map<TreeNode, TreeNode> parentMap = formParentMap(root);

    TreeNode start = findNode(parentMap, startValue);
    TreeNode dest = findNode(parentMap, destValue);
    if (start == null || dest == null) {
      return "";
    }
    return constructPath(parentMap, start, dest);
  }

  private static Map<TreeNode, TreeNode> formParentMap(TreeNode root) {
    Map<TreeNode, TreeNode> parentMap = new HashMap<>();
    parentMap.put(root, null);
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      if (node.left != null) {
        parentMap.put(node.left, node);
        queue.offer(node.left);
      }
      if (node.right != null) {
        parentMap.put(node.right, node);
        queue.offer(node.right);
      }
    }
    return parentMap;
  }

  private static TreeNode findNode(Map<TreeNode, TreeNode> map, int val) {
    return map.keySet().stream().filter(node -> node.val == val).findFirst().orElse(null);
  }

  private static String constructPath(Map<TreeNode, TreeNode> parentMap, TreeNode start,
      TreeNode dest) {
    String directPath = getDirectPath(parentMap, start, dest);
    if (!directPath.isEmpty()) {
      return directPath;
    }

    List<TreeNode> startPath = getPath(start, parentMap);
    List<TreeNode> destPath = getPath(dest, parentMap);
    int startIdx = startPath.size() - 1, destIdx = destPath.size() - 1;
    while (startPath.get(startIdx) != destPath.get(destIdx)) {
      startIdx--;
      destIdx--;
    }

    StringBuilder steps = new StringBuilder();
    steps.append("U".repeat(startPath.size() - startIdx - 1));
    for (int nodeIdx = destIdx + 1; nodeIdx < destPath.size(); nodeIdx++) {
      steps.append(getDirection(parentMap, destPath.get(nodeIdx)));
    }

    return steps.toString();
  }

  private static String getDirection(Map<TreeNode, TreeNode> parentMap, TreeNode node) {
    return parentMap.get(node).left == node ? "L" : "R";
  }

  private static String getDirectPath(Map<TreeNode, TreeNode> parentMap, TreeNode start, TreeNode dest) {
    if (parentMap.get(dest) == start) {
      return getDirection(parentMap, dest);
    }
    if (parentMap.get(start) == dest) {
      return "U"; // + getDirection(parentMap, start);
    }
    return "";
  }

  private static List<TreeNode> getPath(TreeNode node, Map<TreeNode, TreeNode> parentMap) {
    List<TreeNode> path = new ArrayList<>();
    while (node != null) {
      path.add(node);
      node = parentMap.get(node);
    }
    Collections.reverse(path);
    return path;
  }

}
