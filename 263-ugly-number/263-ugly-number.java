class Solution {
    public boolean isUgly(int n) {
        if(n <= 0)
            return false;
        
        else if(n == 1)
            return true;
        
        else{
            for(int i=2; i<=5; i++){
                while(n % i == 0){
                    n /= i;
                }
            }
        }
        
        if(n > 6)
            return false;
        
        return true;
    }
}