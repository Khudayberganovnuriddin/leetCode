package leetcode.top_interview_questions.strings;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.toString(a).equalsIgnoreCase(Arrays.toString(b));
    }
}
