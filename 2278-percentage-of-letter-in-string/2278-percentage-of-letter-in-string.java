class Solution {
    public int percentageLetter(String s, char letter) {
        int n = s.length();
        int count = 0;
        
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == letter)
                count++;
        }

        int percentage = (count * 100)/n;
        
        return percentage;
    }
}