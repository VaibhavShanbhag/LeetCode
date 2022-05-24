class Solution {
    public int balancedStringSplit(String s) {
        int count = 0, L = 0, R = 0;
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == 'L')
                L++;
            else
                R++;
            
            if(L == R)
                count++;
        }
        
        return count;
    }
}