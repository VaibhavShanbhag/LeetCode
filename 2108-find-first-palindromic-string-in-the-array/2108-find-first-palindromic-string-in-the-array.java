class Solution {
    public String firstPalindrome(String[] words) {
        for(String word: words){
            if(pallindrome(word)){
                return word;
            }
        }
        
        return "";
    }
    
    public boolean pallindrome(String str){
        int i=0;
        int j=str.length()-1;
        
        while(i <= j){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);
            
            if(ch1 != ch2)
                return false;
            
            i++;
            j--;
        }
        
        return true;
    }
}