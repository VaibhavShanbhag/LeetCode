class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(!stack.empty() && stack.peek() == ch){
                stack.pop();
            }
            
            else{
                stack.push(ch);
            }
            
        }
        
        String ans = "";
        
        while(!stack.empty()){
            ans = stack.pop() + ans;
        }
        
        return ans;
    }
}