package leetcode.arrays_101.duplicate_zeros;

public class DuplicateZeros {

  public void duplicateZeros(int[] arr) {
    final int ZERO = 0;
    int numberOfZeros = 0;
    int length = arr.length - 1;

    for (int i = 0; i <= length - numberOfZeros; i++) {
      if (arr[i] == ZERO) {
        if (i == length - numberOfZeros) {
          arr[length] = ZERO;
          length -= 1;
          break;
        }
        numberOfZeros++;
      }
    }

    int lastPositionOfCopy = length - numberOfZeros;

    for (int i = lastPositionOfCopy; i >= 0; i--) {
      if (arr[i] == ZERO) {
        arr[i + numberOfZeros] = ZERO;
        numberOfZeros--;
        arr[i + numberOfZeros] = ZERO;
      } else {
        arr[i + numberOfZeros] = arr[i];
      }
    }
  }
}
