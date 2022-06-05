class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        
        int min = nums[0];
        int max = 0;
        int result = 1;
        
        for(int i=0; i<nums.length; i++){
            max = nums[i];
            
            if((max - min) > k){
                result++;
                min = nums[i];
            }    
        }
        
        return result;       
        
    }
}