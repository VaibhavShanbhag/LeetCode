class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] res = new int[2];
        int n = nums.length;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            
            if(map.get(nums[i]) == 2){
                count++;
                map.remove(nums[i]);
            }
        }
        
        res[0] = count;
        res[1] = n - 2 * count;
        
        return res;
    }
}