class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s_stack = new Stack<>();
        Stack<Character> t_stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == '#'){
                if(!s_stack.empty()){
                     s_stack.pop();
                }
            }
            
            else
               s_stack.push(ch); 
        }
        
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            
            if(ch == '#'){
                if(!t_stack.empty()){
                     t_stack.pop();
                }
            }
            
            else
               t_stack.push(ch); 
        }
        
        String s1 = "";
        String t1 = "";
        
        while(!s_stack.empty()){
            s1 = s_stack.pop() + s1;
        }
        
        while(!t_stack.empty()){
            t1 = t_stack.pop() + t1;
        }
        
        return s1.equals(t1);
    }
}