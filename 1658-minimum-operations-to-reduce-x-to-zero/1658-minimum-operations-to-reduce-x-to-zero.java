class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int target = -x;
        
        for(int i: nums)
            target += i;
        
         if(target == 0)
             return n;
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int res = -1;
        int prefix  = 0;
        
        for(int i=0; i<n; i++){
            prefix += nums[i];
            
            if(map.containsKey(prefix - target))
                res = Math.max(res, i-map.get(prefix-target));
            
            map.put(prefix, i);
        }
        
        return res == -1 ? -1 : n - res;
         
    }
}