class Solution {
    public int totalNumbers(int[] digits) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : digits){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        int count = 0;
        for(int i=100;i<=998;i+=2){
            int temp = i;
            int d1 = temp/100;
            int d2 = (temp / 10)%10;
            int d3 = temp % 10;
            if(hm.containsKey(d1) && hm.get(d1) > 0){
                hm.put(d1,hm.get(d1)-1);
                if(hm.containsKey(d2) && hm.get(d2) > 0){
                    hm.put(d2,hm.get(d2)-1);
                    if(hm.containsKey(d3) && hm.get(d3) > 0){
                        count++;  
                    }
                    hm.put(d2,hm.get(d2)+1);
                }
                hm.put(d1,hm.get(d1)+1); 
            }
        }
        return count;
    }
}