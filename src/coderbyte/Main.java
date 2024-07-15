package coderbyte;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

  public static String TreeConstructor(String[] strArr) {
    HashMap<Integer, Integer> parentCount = new HashMap<>();
    HashMap<Integer, Integer> childCount = new HashMap<>();
    for (String str : strArr) {
      String[] nodes = str.replaceAll("[()]", "").split(",");
      int child = Integer.parseInt(nodes[0].trim());
      int parent = Integer.parseInt(nodes[1].trim());

      int childCounter = childCount.containsKey(parent) ? childCount.get(parent) + 1 : 1;
      childCount.put(parent, childCounter);

      if (childCount.containsValue(3)) {
        return "false";
      }

      int parentCounter = parentCount.containsKey(child) ? parentCount.get(child) + 1 : 1;
      parentCount.put(child, parentCounter);

      if (parentCount.containsValue(2)) {
        return "false";
      }
    }
    return "true";
  }

  public static void main(String[] args) {
    // keep this function call here
    Scanner s = new Scanner(System.in);
//    System.out.print(TreeConstructor(s.nextLine()));
  }
}
