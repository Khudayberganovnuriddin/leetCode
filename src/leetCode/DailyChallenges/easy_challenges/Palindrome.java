package leetCode.DailyChallenges.easy_challenges;

public class Palindrome {
    private static boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int res = 0;
        while (x > res) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        return (x == res || x == res / 10);
    }
}
