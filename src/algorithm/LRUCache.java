package algorithm;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class CacheObject {

  int key;              // key to access actual data
  String value;         // data to be accessed by cache

  CacheObject(int key, String value) {
    this.key = key;
    this.value = value;
  }
}

public class LRUCache {

  private final Deque<Integer> deque = new LinkedList<>();
  private final Map<Integer, CacheObject> cacheItemsMap = new HashMap<>();
  private final int CACHE_CAPACITY = 4;

  public String retrieveItem(int key) {
    if (cacheItemsMap.containsKey(key)) {
      CacheObject current = cacheItemsMap.get(key);
      deque.remove(current.key);
      deque.addFirst(current.key);
      return current.value;
    }
    return "No such element present in Cache";
  }

  public void cacheItem(int key, String value) {
    if (cacheItemsMap.containsKey(key)) {
      CacheObject curr = cacheItemsMap.get(key);
      deque.remove(curr.key);
    } else {
      removeLeastRecentlyUsedItemIfNecessary();
    }

    CacheObject newItem = new CacheObject(key, value);
    deque.addFirst(newItem.key);
    cacheItemsMap.put(key, newItem);
  }

  private void removeLeastRecentlyUsedItemIfNecessary() {
    if (deque.size() == CACHE_CAPACITY) {
      int lastKey = deque.removeLast();
      cacheItemsMap.remove(lastKey);
    }
  }
}
