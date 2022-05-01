class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int num: nums1)
            map.put(num,map.getOrDefault(num,0)+1);
        
        for(int num: nums2){
            if(map.containsKey(num)){
                if(map.get(num) > 1){
                    map.put(num,map.get(num)-1);
                }
                
                else{
                    map.remove(num);
                }
                
                res.add(num);
            }
        }
        
        int[] result = new int[res.size()];
        
        for(int i=0; i<res.size(); i++){
            result[i] = res.get(i);
        }
        
        return result;
    }
}