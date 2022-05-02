class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        
        if(n == 1)
            return nums;
        
        for(int i=0; i<n; i++){
            if(nums[i] % 2 == 0){
                even.add(nums[i]);
            }
            
            else{
                odd.add(nums[i]);
            }
        }
        
        int j = 0;
        
        for(int i=0; i<even.size(); i++){
            nums[j++] = even.get(i);
        }
        
        for(int i=0; i<odd.size(); i++){
            nums[j++] = odd.get(i);
        }
        
        return nums;
    }
}