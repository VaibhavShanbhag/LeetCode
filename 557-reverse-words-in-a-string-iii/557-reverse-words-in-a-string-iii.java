class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        
        for(int i=0; i<str.length; i++){
            String st = reverseString(str[i]);
            str[i] = st;
        }
        
        String res = "";
        
        for(int i=0; i<str.length; i++){
            res = res + str[i] + " ";
        }
        
        return res.substring(0, res.length()-1);
    }
    
    public String reverseString(String s){
        char[] str = s.toCharArray();
        int i=0;
        int j=str.length-1;
        
        while(i <= j){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            
            i++;
            j--;
        }
        
        return new String(str);
    }
}