class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0;
//         int[] res = new int[n];
//         int k = 0;
        
//         for(int i=0; i<n; i++){
//             if(nums[i] != 0){
//                 res[k++] = nums[i];
//             }
            
//             else{
//                 count++;
//             }
//         }
        
//         for(int i=0; i<count; i++){
//             res[k++] = 0;
//         }
        
//         for(int i=0; i<n; i++){
//             nums[i] = res[i];
//         }
        
        
        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                swap(nums,i,count);
                count++;
            }
        }
        
    }
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}