package leetcode.top_interview_questions.strings;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String parsed = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        StringBuilder builder = new StringBuilder();
        builder.append(parsed);
        builder.reverse();
        String reversed = builder.toString();
        return parsed.equals(reversed);
    }
}
