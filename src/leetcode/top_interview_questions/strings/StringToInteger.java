package leetcode.top_interview_questions.strings;

public class StringToInteger {
    public static int myAtoi(String s) {
        int sign = 1;
        int i = 0;
        int r = 0;
        s = s.trim();
        if (s.isEmpty()) return 0;
        else if (s.charAt(i) == '-') {
            i++;
            sign = -1;
        } else if (s.charAt(i) == '+') {
            i++;
        }
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int d = s.charAt(i) - '0';
            if (r > (Integer.MAX_VALUE - d) / 10)
                return sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            r = r * 10 + d;
            i++;
        }
        return r * sign;
    }
}
