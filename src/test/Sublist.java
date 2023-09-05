package test;

import java.util.ArrayList;
import java.util.List;

class Sublist {
    public static void main(String[] args) {
        Sublist main = new Sublist();
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        var result = main.splitIntoBuckets(list, 3);
        System.out.println(result);
        // the result should be [[1, 2, 3], [4, 5, 6], [7, 8, 9], [10]]
    }

    /**
     * Split the given flat list into a list of lists. Each nested list should contain n elements
     */
    public List<List<Integer>> splitIntoBuckets(List<Integer> list, int n) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<list.size();i += n){
            result.add(new ArrayList<>(list.subList(i,Math.min(list.size(),i+n))));
        }
        return result;
    }
}