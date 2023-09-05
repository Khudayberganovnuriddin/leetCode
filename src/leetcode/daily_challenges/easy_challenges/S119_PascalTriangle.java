package leetcode.daily_challenges.easy_challenges;

import java.util.ArrayList;
import java.util.List;

public class S119_PascalTriangle {

  public static void main(String[] args) {
    System.out.println(getRow(3));
  }

//  public static List<Integer> getRow(int rowIndex) {
//    Map<Integer, List<Integer>> myMap = new HashMap<>();
//    List<Integer> first_row = new ArrayList<>();
//    first_row.add(1);
//    myMap.put(0, first_row);
//    if (rowIndex == 0) return myMap.get(rowIndex);
//    for (int i = 1; i <= rowIndex; i++) {
//      List<Integer> row = new ArrayList<>();
//      row.add(1);
//      for (int j = 1; j < i; j++) {
//        row.add(myMap.get(i-1).get(j - 1) + myMap.get(i-1).get(j));
//      }
//      row.add(1);
//      myMap.put(i, row);
//    }
//
//    return myMap.get(rowIndex);
//  }

  public static List<Integer> getRow(int rowIndex) {
    List<Integer> l = new ArrayList<>();
    double n = 1;
    l.add((int) n);
    for (double i = 1; i < rowIndex + 1; i++) {
      n *= ((double) rowIndex - i + 1.0) / (i);
      l.add((int) Math.round(n));
    }
    return l;
  }
}
