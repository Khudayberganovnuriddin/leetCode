package leetCode.TopInterviewQuestions.Array;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        return plusOne(digits, digits.length);
    }

    private static int[] plusOne(int[] digits, int length) {
        if(digits[length-1] != 9){
            digits[length-1] += 1;
            return digits;
        }
        digits[length-1] = 0;
        if(length-1 == 0){
            int[] newDigits = new int[length+1];
            newDigits[0] = 1;
            return newDigits;
        }
        return plusOne(digits, length-1);
    }

}
