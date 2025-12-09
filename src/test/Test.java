package test;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class Test {

  public static void main(String[] args) {
    IntSupplier fib = new IntSupplier() {
      int previous = 0;
      int current = 1;
      @Override
      public int getAsInt() {
        int oldPrevious = this.previous;
        int newValue = this.previous + this.current;
        this.previous = this.current;
        this.current = newValue;
        return oldPrevious;
      }
    };

    IntStream.generate(fib).limit(10).forEach(System.out::println);

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
