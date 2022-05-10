class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        int n = patterns.length;
        
        for(int i=0; i<n; i++){
            if(word.contains(patterns[i])){
                count++;
            }
        }
        
        return count;
    }
}