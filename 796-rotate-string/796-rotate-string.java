class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
            return false;
        
        String s2 = s + s;
        
        for(int i=0; i<s.length(); i++){
            String ch = s2.substring(i, i + s.length());
            
            if(ch.equals(goal))
                return true;
        }
        
        return false;
    }
}