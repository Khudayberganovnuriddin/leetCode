package leetCode.TopInterviewQuestions.Strings;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (String str : strs) {
            prefix = getCommonPrefix(prefix, str);
        }
        return prefix;
    }

    private static String getCommonPrefix(String prefix, String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0, j = 0; i < prefix.length() && j < str.length(); i++, j++) {
            if (prefix.charAt(i) != str.charAt(j)) {
                break;
            }
            res.append(prefix.charAt(i));
        }
        return res.toString();
    }
}
