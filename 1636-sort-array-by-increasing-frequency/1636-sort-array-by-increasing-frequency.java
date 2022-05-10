class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> al = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int a: nums){
            map.put(a, map.getOrDefault(a,0)+1);
            al.add(a);
        }
        
        Collections.sort(al,(a,b)->{
            int f1 = map.get(a);
            int f2 = map.get(b);
            if(f1 != f2) return f1-f2;
            return b-a;
        });
        
        int[] res = new int[al.size()];
        
        for(int i=0; i<al.size(); i++){
            res[i] = al.get(i);
        }
            
        
        return res;
    }
}