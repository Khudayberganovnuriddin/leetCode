package leetCode.TopInterviewQuestions.Strings;

import java.util.Arrays;

public class ReverseStrings {
    public static void reverseString(char[] s) {
        char[] arr = Arrays.copyOf(s,s.length);
        int j=0;
        for(int i=arr.length-1;i>=0;--i){
            s[j] = arr[i];
            j++;
        }
    }
}
