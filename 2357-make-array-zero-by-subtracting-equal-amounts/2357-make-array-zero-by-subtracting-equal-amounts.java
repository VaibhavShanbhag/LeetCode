class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 0;
        int zerocount = 0;
        int min = 0;
        int j = 0;
        
        while(zerocount < n){
            for(int i=j; i<n; i++){
                if(nums[i] == 0){
                    zerocount++;
                }
                
                else{
                    min = nums[i];
                    j = i;
                    count++;
                    break;
                }
            }
            
            for(int k=j; k<n; k++){
                nums[k] = nums[k] - min;
            }
        }
        
        return count;
    }
}