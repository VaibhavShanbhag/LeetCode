class Solution {
    public int countPrefixes(String[] words, String s) {
        int n = words.length;
        int ans = 0;
        
        for(int i=0; i<n; i++){
            if(s.startsWith(words[i])){
                ans++;
            }
        }
        
        return ans;
    }
}