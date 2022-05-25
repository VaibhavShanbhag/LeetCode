class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        
        for(String str: words){
            boolean isValid = true;
            for(char ch: str.toCharArray()){
                if(!allowed.contains(String.valueOf(ch)))
                    isValid = false;
            }
            if(isValid == true)
                count++;
        }
        
        return count;
    }
}