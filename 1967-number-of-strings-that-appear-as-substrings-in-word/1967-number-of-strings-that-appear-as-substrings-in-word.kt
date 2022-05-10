class Solution {
    fun numOfStrings(patterns: Array<String>, word: String): Int {
        var count: Int = 0
        var n: Int = patterns.size
        
        for(i in 0..n-1){
            if(word.contains(patterns[i])){
                count++;
            }
        }
        
        return count;
    }
}