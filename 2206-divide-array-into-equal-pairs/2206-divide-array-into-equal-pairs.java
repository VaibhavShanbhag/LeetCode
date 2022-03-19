class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        
        int n = nums.length;
        int total_pairs = n / 2;
        int count_pairs = 0;
        
        for(int i=0; i<n-1; i+=2){
            if(nums[i] == nums[i+1]){
                count_pairs++;
            }
        }
        
        
        return (total_pairs == count_pairs) ? true : false;
        
    }
}