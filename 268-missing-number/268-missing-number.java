class Solution {
    public int missingNumber(int[] nums) {
        int res = 0;
        
        for(int i:nums){
            res ^= i;
        }
        
        for(int i=1; i<= nums.length; i++){
            res ^= i;
        }
        
        return res;
        
    }
}