class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        
        if(digits[digits.length-1] < 9){
            digits[digits.length-1]++;
            return digits;
        }
        
        for(int i=digits.length-1; i>=0; i--){
            digits[i] = digits[i] + carry;
            
            if(digits[i] == 10){
                digits[i] = 0;
                carry = 1;
            }
            
            else{
                carry = 0;
            }
        }
        
        if(carry == 1){
            int[] large = new int[digits.length+1];
            large[0] = 1;
            return large;
        }
        
        return digits;
    }
}