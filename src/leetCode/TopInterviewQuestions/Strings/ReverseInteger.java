package leetCode.TopInterviewQuestions.Strings;

public class ReverseInteger {
    public static int reverse(int x) {
        int result = 0;
        while(x != 0){
            int tail = x%10;
            int i = result * 10 + tail;
            if((i-tail) / 10 != result){
                return 0;
            }
            result = i;
            x = x/10;
        }
        return result;
    }
}
