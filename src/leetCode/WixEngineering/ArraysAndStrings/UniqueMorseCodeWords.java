package leetCode.WixEngineering.ArraysAndStrings;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    public static int uniqueMorseRepresentations(String[] words) {
        String[] morseCodes = new String[]
                {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> wordsSet = new HashSet<>();
        for(String word : words){
            StringBuilder code = new StringBuilder();
            for(char c : word.toCharArray()){
                code.append(morseCodes[c - 'a']);
            }
            wordsSet.add(code.toString());
        }
        return wordsSet.size();
    }
}
