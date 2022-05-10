class Solution {
    public String replaceDigits(String s) {
        char[] str = s.toCharArray();
        int n = str.length;
        
        for(int i=0; i<n; i++){
            if(i % 2 == 1){
                str[i] = (char)(str[i-1] + str[i] - '0');
            }
        }
        
        return new String(str);
        
    }
}