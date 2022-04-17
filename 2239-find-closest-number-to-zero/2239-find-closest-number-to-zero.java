class Solution {
    public int findClosestNumber(int[] nums) {
       int[] arr = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            arr[i] = Math.abs(nums[i]);
        }
        
        Arrays.sort(arr);
        int j = 0;
        
        for(int i=0; i<nums.length; i++){
            if(arr[0] == Math.abs(nums[i])){
                if(nums[i] > 0)
                    return nums[i];
                
                j = i;
            }
            
            
        }
        
        return nums[j];
    }
}