package leetCode.DailyChallenges.easy_challenges;

public class MySqrt {
    public static int mySqrt(int x) {
        long r = x;
        while (r * r > x)
            r = (r + x / r) / 2;
        return (int) r;
    }
}
