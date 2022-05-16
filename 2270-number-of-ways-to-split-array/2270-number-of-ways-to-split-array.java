class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long[] prefixSum = new long[n];
        prefixSum[0] = nums[0];
        
        for(int i=1; i<n; i++){
            prefixSum[i] = nums[i] + prefixSum[i-1];
        }
        
        int count = 0;
        
        for(int i=0; i<n-1; i++){
            long left = prefixSum[i];
            long right = prefixSum[n-1] - left;
            
            if(left >= right)
                count++;
        }
        
        return count;
    }
}