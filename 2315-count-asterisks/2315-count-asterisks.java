class Solution {
    public int countAsterisks(String s) {
        int bars = 0;
        int res = 0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '*' && bars % 2 == 0)
                res++;
            
            if(s.charAt(i) == '|')
                bars++;
        }
        
        return res;
    }
}