class Solution {
    public int mostWordsFound(String[] sentences) {
        int finalMax = Integer.MIN_VALUE;
        
        for(int i=0; i<sentences.length; i++){
            int currMax = sentences[i].split(" ").length;
            finalMax = Math.max(finalMax, currMax);
        }
        
        return finalMax;
    }
}