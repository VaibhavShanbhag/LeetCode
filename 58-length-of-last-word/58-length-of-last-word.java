class Solution {
    public int lengthOfLastWord(String s) {
        char[] str = s.toCharArray();
        int n = str.length;
        int j = n-1;
        
        if(str[n-1] != 32){
            for(int i=n-1; i>=0; i--){
                if(str[i] != 32){
                    j = i;
                }
                
                else{
                    break;
                }
            }
            
            return n - j;
        }
        

        
        else{
            j = n-1;
            int k = j;
            while(str[j] == 32){
                j--;
            }
            
            for(int i=j; i>=0; i--){
                if(str[i] != 32){
                    k = i;
                }
                
                else{
                    break;
                }
            }
            
            return j-k + 1;
        }
    }
}