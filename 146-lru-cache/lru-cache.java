class LRUCache {
    private final int capacity;
    LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<>();
    public LRUCache(int capacity) {
       this.capacity = capacity;
    }
    
    public int get(int key) {
     if(hm.containsKey(key)){
        int val = hm.get(key);
        hm.remove(key);
        hm.putFirst(key,val);
        return val;
     }   
     return -1;
    }
    public void put(int key, int value) {
            if(hm.containsKey(key)){
                hm.remove(key);
            } else if(hm.size() >= capacity){
                hm.sequencedKeySet().removeLast();
            }
            hm.putFirst(key,value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */