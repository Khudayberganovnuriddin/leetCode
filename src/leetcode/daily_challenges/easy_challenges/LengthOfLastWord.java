package leetcode.daily_challenges.easy_challenges;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s){
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else {
                if (length > 0) return length;
            }
        }
        return length;
    }
}
