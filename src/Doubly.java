import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class LRUCache {
    private final int capacity;
    LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<>();
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if(hm.containsKey(key)){
            int value = hm.get(key);
            hm.remove(key);
            hm.putFirst(key,value);
            return value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(hm.containsKey(key)) {
            hm.remove(key);
        }else if(hm.size() >= capacity){
                hm.sequencedKeySet().removeLast();
        }

        hm.putFirst(key,value);

        System.out.println(hm + "iam treeset");

    }
}
public class Doubly {
    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(2,1); // cache is {1=1}
        lRUCache.put(2,2); // cache is {1=1, 2=2}
        System.out.println(lRUCache.get(2));    // return 1
        lRUCache.put(1,1); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
//        System.out.println(lRUCache.get(2));    // returns -1 (not found)
        lRUCache.put(4, 1); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        System.out.println(lRUCache.get(2));    // return -1 (not found)
//        System.out.println(lRUCache.get(3));    // return 3
//        System.out.println(lRUCache.get(4));    // return 4
    }
}
