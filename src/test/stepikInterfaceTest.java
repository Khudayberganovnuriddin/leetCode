package test;

interface A {

  int sum(int x, int y);

}

class B implements A {

  public int diff(int x, int y) {
    return x - y;
  }

  public int sum(int x, int y) {
    return x + y;
  }

}

class C extends B {

  public int mult(int x, int y) {
    return x * y;
  }

  public int diff(int x, int y) {
    return y - x;
  }

}

public class stepikInterfaceTest {
  public static void main(String[] args) {
    A aB = new B();
//    aB.diff(1,2)

    A aC = new C();
    System.out.println(aC.sum(1, 1) == 2);

    B bB = new B();
    System.out.println(bB.diff(1, 2) == 1);

    B bC = new C();
    System.out.println(bC.diff(1, 2) == 1);
//    bC.mult()

    C cC = new C();
  }
}
