import java.util.*;

class RandomizedSet {
    private HashMap<Integer,Integer> hs;
    private List<Integer> ls;
    private Random rs;
    public RandomizedSet() {
        hs = new HashMap<Integer,Integer>();
        ls = new ArrayList<>();
        rs = new Random();
    }

    public boolean insert(int val) {

        if(!hs.containsKey(val)){
            hs.put(val,ls.size());
            ls.add(val);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if(hs.containsKey(val)){
            int idx = hs.get(val);
            int le = ls.get(ls.size()-1);
            ls.set(idx,le);
            hs.put(le,idx);
            ls.remove(ls.size()-1);
            hs.remove(val);
            return  true;
        }
        return false;
    }

    public int getRandom() {
        return ls.get(rs.nextInt(ls.size()));
    }
}
public class InsertDelete {
    public static void main(String[] args) {
        RandomizedSet randomSet = new RandomizedSet();

// Inserts 1 to the set. Returns true as 1 was inserted successfully.
        System.out.println(randomSet.insert(1));

// Returns false as 2 does not exist in the set.
        System.out.println(randomSet.remove(2));

// Inserts 2 to the set, returns true. Set now contains [1,2].
        System.out.println(randomSet.insert(2));

// getRandom should return either 1 or 2 randomly.
        System.out.println(randomSet.getRandom());

// Removes 1 from the set, returns true. Set now contains [2].
        System.out.println(randomSet.remove(1));

// 2 was already in the set, so return false.
        System.out.println(randomSet.insert(2));

// Since 2 is the only number in the set, getRandom always return 2.
        System.out.println(randomSet.getRandom());
    }
}
