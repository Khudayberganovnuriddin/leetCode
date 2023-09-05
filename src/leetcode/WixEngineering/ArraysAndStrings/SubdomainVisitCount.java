package leetcode.WixEngineering.ArraysAndStrings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubdomainVisitCount {
    public static List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> counts = new HashMap<>();
        for (String domain : cpdomains) {
            String[] cpInfo = domain.split("\\s+");
            String[] frags = cpInfo[1].split("\\.");
            int count = Integer.parseInt(cpInfo[0]);
            String cur = "";
            for (int i = frags.length - 1; i >= 0; i--) {
                cur = frags[i] + (i < frags.length - 1 ? "." : "") + cur;
                counts.put(cur, counts.getOrDefault(cur, 0) + count);
            }
        }

        return counts.keySet().stream().map(dom -> "" + counts.get(dom) + " " + dom).toList();
    }
}
