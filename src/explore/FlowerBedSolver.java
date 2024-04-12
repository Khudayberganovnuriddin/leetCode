package explore;

/**
 * Soution: 605
 */
public class FlowerBedSolver {

  private static final int PLANTING_DIVISOR = 2; // Extract magic number into a named constant

  public static void main(String[] args) {
    System.out.println(canPlantFlowers(new int[]{1, 0, 0, 0, 0, 0, 1}, 2));
  }

  public static boolean canPlantFlowers(int[] flowerBed, int flowerCount) {

    int emptySpots = 1;
    int possiblePlantingSpots = 0;

    for (int cell : flowerBed) {
      if (cell == 0) {
        ++emptySpots;
      } else {
        possiblePlantingSpots += (emptySpots - 1) / PLANTING_DIVISOR;
        emptySpots = 0;
      }
    }

    //Check if enough spots are there to plant all flowers
    return possiblePlantingSpots + emptySpots / PLANTING_DIVISOR >= flowerCount;
  }
}
