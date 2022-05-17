class Solution {
    public int sumOfBeauties(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int beauty = 0;
        int value = nums[0];
        
        for(int i=0; i<n; i++){
            value = Math.max(value,nums[i]);
            prefix[i] = value;
        }
        
        value = nums[n-1];
        for(int i=n-1; i>=0; i--){
            value = Math.min(value, nums[i]);
            suffix[i] = value;
        }
        
        for(int i=1; i<=n-2; i++){
            if(nums[i] > prefix[i-1] && nums[i] < suffix[i+1])
                beauty+=2;
            
            else if(nums[i] > nums[i-1] && nums[i+1] > nums[i])
                beauty+=1;
        }
        
        return beauty;
        
        
    }
}