class Solution {
    public long maximumSubsequenceCount(String text, String pattern) {
        long res = 0;
        long cnt1 = 0;
        long cnt2 = 0;
        
        for(int i=0; i<text.length(); i++){
            if(text.charAt(i) == pattern.charAt(1)){
                res += cnt1;
                cnt2++;
            }
            
            if(text.charAt(i) == pattern.charAt(0)){
                cnt1++;
            }
        }
        
        return res + Math.max(cnt1,cnt2);
    }
}