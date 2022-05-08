class Solution {
    public String largestGoodInteger(String num) {
        int n = num.length();
        String ans = "";
        
        for(int i=0; i<n-2; i++){
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)){
                if(num.substring(i, i+3).compareTo(ans) > 0){
                    ans = num.substring(i, i+3);
                }
            }
        }
        
        return ans;
    }
}