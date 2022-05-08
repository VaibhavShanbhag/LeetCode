class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int minElement = Integer.MIN_VALUE;
        
        for(int i=n-1; i>=0; i--){
            if(nums[i] < minElement)
                return true;
            
            while(!stack.empty() && stack.peek() < nums[i]){
                minElement = stack.pop();
            }
            
            stack.push(nums[i]);
            
        }
        
        return false;
    }
}