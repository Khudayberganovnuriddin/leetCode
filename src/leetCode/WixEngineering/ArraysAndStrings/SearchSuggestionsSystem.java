package leetCode.WixEngineering.ArraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SearchSuggestionsSystem {
    private final TrieNode root = new TrieNode();

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        for (String product : products) {
            insert(product);
        }
        return search(searchWord);
    }

    public void insert(String word) {
        TrieNode curr = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new TrieNode();
            }
            curr = curr.children[index];
            curr.suggestion.offer(word);
            if (curr.suggestion.size() > 3) {
                curr.suggestion.pollLast();
            }
        }
    }

    public List<List<String>> search(String searchWord) {
        List<List<String>> result = new ArrayList<>();
        TrieNode current = root;
        for (char ch : searchWord.toCharArray()) {
            int index = ch - 'a';
            if (current != null) {
                current = current.children[index];
            }
            result.add(current == null ? List.of() : current.suggestion);
        }
        return result;
    }
}

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    LinkedList<String> suggestion = new LinkedList<>();
}
