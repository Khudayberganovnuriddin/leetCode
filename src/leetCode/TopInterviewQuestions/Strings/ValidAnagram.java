package leetCode.TopInterviewQuestions.Strings;

import java.util.Arrays;

public class ValidAnagram {
    private ValidAnagram() {

    }

    public static boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.toString(a).equalsIgnoreCase(Arrays.toString(b));
    }
}
