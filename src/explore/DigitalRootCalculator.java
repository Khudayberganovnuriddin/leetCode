package explore;

/**
 * Solution 258
 */
public class DigitalRootCalculator {

  /**
   * Compute the digital root of a non-negative integer. The digital root is the recursive sum of
   * all the digits in a number. Given n, take the sum of the digits of n. If that value has two
   * digits, continue reducing in this way until a single-digit number is produced. This is also
   * known as the digital root.
   *
   * @param num The non-negative integer of which to compute the digital root.
   * @return The digital root of the input number.
   */
  public int computeDigitalRoot(int num) {
    return (num - 1) % 9 + 1;
  }
}
