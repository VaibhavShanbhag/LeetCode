class Solution {
    public String digitSum(String s, int k) {
        
        while(s.length() > k){
            s = calDigitSum(s,k);
        }
        
        return s;
    }
    
    private String calDigitSum(String s, int k){
        int i=0;
        int j=0;
        String ans = "";
        int sum = 0;
        
        for(;i<s.length();){
            while(j<k && i<s.length()){
                sum += (s.charAt(i) - '0');
                i++;
                j++;
            }
            
            ans += sum;
            j = 0;
            sum = 0;
        }
        
        return ans;
    }
}