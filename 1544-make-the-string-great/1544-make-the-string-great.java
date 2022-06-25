class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!stack.empty() && stack.peek() != ch && (stack.peek() == Character.toLowerCase(ch) || stack.peek() == Character.toUpperCase(ch)))
                stack.pop();
            
            else
                stack.push(ch);
        }
        
        String res = "";
        
        while(!stack.empty()){
            res = stack.pop() + res;
        }
        
        return res;
    }
}