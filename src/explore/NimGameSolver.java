package explore;

/**
 * Solution: 292
 */
public class NimGameSolver {

  private static final int NIM_GAME_THRESHOLD = 4;

  public boolean canWinGame(int stoneCount) {
    return stoneCount % NIM_GAME_THRESHOLD != 0;
  }
}
