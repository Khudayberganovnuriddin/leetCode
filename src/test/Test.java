package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Test {

  public static void main(String[] args) {
    try {
      badMethod();
      System.out.print("A");
    } catch (RuntimeException ex) {
      System.out.print("B");
    } catch (Exception ex1) {
      System.out.print("C");
    } finally {
      System.out.print("D");
    }
    System.out.print("E");
//    List<Integer> qwe = new ArrayList<>();
//    qwe.addAll(List.of(1,2,3,4));
//    Iterator<Integer> iterator = qwe.iterator();
//    while(iterator.hasNext()) {
//      Integer next = iterator.next();
//      System.out.println(next);
//      if (next == 3) {
//        qwe.add(5);
//      }
//    }
//    for (int i = 0; i < qwe.size(); i++) {
//      System.out.println(qwe.get(i));
//      if (qwe.get(i) == 3) {
//        qwe.add(5);
//      }
//    }
  }

  public static void badMethod() {
    throw new RuntimeException();
  }
}
