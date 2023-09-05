package leetcode.top_interview_questions.math;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> resp = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3 == 0 && i%5 == 0){
                resp.add("FizzBuzz");
            }else if(i%5 == 0){
                resp.add("Buzz");
            }else if(i%3 == 0){
                resp.add("Fizz");
            }else{
                resp.add(String.valueOf(i));
            }
        }
        return resp;
    }
}
