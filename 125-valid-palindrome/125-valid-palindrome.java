class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();  
        str = str.replaceAll("[^a-zA-Z0-9]","");
        
        int high = str.length() - 1;
        int low = 0;
        
        while(low <= high)
        {
            if(str.charAt(low) != str.charAt(high))
                return false;
            
            low++;
            high--;
        }
        
        return true;
    }
}