class Solution {
    public int totalFruit(int[] fruits) {
         HashMap<Integer,Integer> hs = new HashMap<>();
        int left = 0;
        int maxSize = 0;
        for(int i=0;i<fruits.length;i++){
            hs.put(fruits[i],hs.getOrDefault(fruits[i],0)+1);
            while(left < fruits.length && hs.size() > 2){
                hs.put(fruits[left],hs.getOrDefault(fruits[left],0)-1);
                if(hs.containsKey(fruits[left]) && hs.get(fruits[left]) == 0)hs.remove(fruits[left]);
                left++;
            }
            maxSize = Math.max(maxSize,i - left + 1);
        }
        return maxSize;
    }
}