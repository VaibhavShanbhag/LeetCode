class Solution {
    public String reversePrefix(String word, char ch) {
        char[] str = word.toCharArray();
        int findIndex = -1;
        
        for(int i=0; i<str.length; i++){
            if(str[i] == ch){
                findIndex = i;
                break;
            }
        }
        
        if(findIndex == -1)
            return word;
        
        int start = 0;
        int end = findIndex;
        
        while(start < end){
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            
            start++;
            end--;
        }
        
        return new String(str);
    }
}