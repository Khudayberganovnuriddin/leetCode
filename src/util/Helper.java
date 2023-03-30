package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Helper {

    public String getInputUser(String msg){
        String inputLine = null;
        System.out.print(msg + " ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            inputLine = reader.readLine();
            if(inputLine.length() == 0) return null;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputLine;
    }
}
