class Solution {
    public int removePalindromeSub(String s) {
        int start = 0;
        int end = s.length()-1;
        
        while(start <= end){
            char ch_start = s.charAt(start);
            char ch_end = s.charAt(end);
            
            if(ch_start != ch_end)
                return 2;
            
            start++;
            end--;
        }
        
        return 1;
    }
}