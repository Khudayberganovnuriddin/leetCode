package algorithm;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class Cache {

  int key;
  String value;

  Cache(int key, String value) {
    this.key = key;
    this.value = value;
  }
}

public class LRU {

  private static final Deque<Integer> deque = new LinkedList<>();
  private final Map<Integer, Cache> cacheItemsMap = new HashMap<>();
  private int CACHE_CAPACITY = 4;

  public String getElementFromCache(int key) {
    if (cacheItemsMap.containsKey(key)) {
      Cache current = cacheItemsMap.get(key);
      deque.remove(current.key);
      deque.addFirst(current.key);
      return current.value;
    }
    return "Not exist";
  }

  public void cacheItem(int key, String value) {
    if (cacheItemsMap.containsKey(key)) {
      Cache curr = cacheItemsMap.get(key);
      deque.remove(curr.key);
    } else {
      removeLeastRecentlyUsedItemIfNecessary();
    }
    Cache newItem = new Cache(key, value);
    deque.addFirst(newItem.key);
    cacheItemsMap.put(key, newItem);
  }

  private void removeLeastRecentlyUsedItemIfNecessary() {
    if (deque.size() == CACHE_CAPACITY) {
      int temp = deque.removeLast();
      cacheItemsMap.remove(temp);
    }
  }

  public static void main(String[] args) {
    LRU cache = new LRU();
    cache.cacheItem(1, "Value_1");
    cache.cacheItem(2, "Value_2");
    cache.cacheItem(3, "Value_3");
    cache.cacheItem(4, "Value_4");
    System.out.println(cache.getElementFromCache(2));
    System.out.println();
    System.out.println(deque);
    System.out.println();
    System.out.println(cache.getElementFromCache(5));
    cache.cacheItem(5, "Value_5");
    System.out.println();
    System.out.println(deque);
    System.out.println();
  }
}