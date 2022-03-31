package turing;

import java.util.*;

public class CalcBySymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ops = scanner.nextLine().split(" ");
        System.out.println(CalcBySymbols.calPoints(ops));
    }

    private static Integer calPoints(String[] ops) {
        int result;
        List<String> inputList = Arrays.asList(ops);
        ArrayList<Integer> myList = new ArrayList<>();
        for (String op : ops) {
            if (op.toLowerCase(Locale.ROOT).equalsIgnoreCase("c")) {
                myList.remove(inputList.indexOf(op) - 1);
            } else if (op.toLowerCase(Locale.ROOT).equalsIgnoreCase("d")) {
                myList.add(2 * myList.get(myList.size()-1));
            } else if (op.equalsIgnoreCase("+")) {
                myList.add(myList.get(myList.size()-2) + myList.get(myList.size()-1));
            } else {
                myList.add(Integer.valueOf(op));
            }
        }
        result = myList.stream().mapToInt(value -> value).sum();
        return result;
    }
}
