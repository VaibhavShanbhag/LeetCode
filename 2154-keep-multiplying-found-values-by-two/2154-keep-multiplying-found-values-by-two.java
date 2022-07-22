class Solution {
    public int findFinalValue(int[] nums, int original) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            list.add(nums[i]);
        }
        
        while(list.contains(original)){
            original *= 2;
        }
        
        return original;
    }
}