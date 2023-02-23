package algorithm;

//import the required collection classes
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class CacheObject
{
  int key;              // key to access actual data
  String value;         // data to be accessed by cache

  CacheObject(int key, String value) {
    this.key = key;
    this.value = value;
  }
}

public class LRUCache {

  //  queue which acts as algorithm.Cache to store data.
  static Deque<Integer> q = new LinkedList<>();

  // Map to store key value pair of data items.
  static Map<Integer, CacheObject> map = new HashMap<>();
  int CACHE_CAPACITY = 4;

  public String getElementFromCache(int key) // get data from cache if key is already present.
  {

    // if item present in cache remove and add to front of cache
    if(map.containsKey(key))
    {
      CacheObject current = map.get(key);
      q.remove(current.key);
      q.addFirst(current.key);
      return current.value;
    }

    return "No such element present in algorithm.Cache";
  }

  public void putElementInCache(int key, String value)
  {
    if(map.containsKey(key))
    {
      CacheObject curr = map.get(key);     // we check if element already present in cache through Map
      q.remove(curr.key);                  // remove if already present
    }
    else
    {
      if(q.size() == CACHE_CAPACITY)
      {
        int temp = q.removeLast();  // if cache size is full we remove from last of queue
        map.remove(temp);
      }
    }

    // then we just add already present item or new item with given key and value.

    CacheObject newItem = new CacheObject(key, value);
    q.addFirst(newItem.key);
    map.put(key, newItem);
  }

  // Driver Code to test above methods.
  public static void main(String[] args)
  {

    LRUCache cache = new LRUCache();
    cache.putElementInCache(1, "Product-A-Name");
    cache.putElementInCache(2, "Product-B-Name");
    cache.putElementInCache(3, "Product-C-Name");
    cache.putElementInCache(4, "Product-D-Name");

    // We get 2 from cache
    System.out.println(cache.getElementFromCache(2));
    System.out.println();

    // We print our queue and see 2 will be at front of cache
    System.out.println(q);
    System.out.println();

    //Element 5 is not present in algorithm.Cache
    System.out.println(cache.getElementFromCache(5));
    cache.putElementInCache(5,"Product-E-Name");
    System.out.println();

    //Now after adding 5 in cache it will be at front and 1 is deleted.
    System.out.println(q);
    System.out.println();

  }

}
