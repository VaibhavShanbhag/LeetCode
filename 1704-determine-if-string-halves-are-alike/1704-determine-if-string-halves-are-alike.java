class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        String a = s.substring(0,n/2);
        String b = s.substring(n/2,n);
        
        int countA = 0;
        int countB = 0;
        
        for(int i=0; i<a.length(); i++){
            char ch = a.charAt(i);
            
            if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
                countA++;
        }
        
        for(int i=0; i<b.length(); i++){
            char ch = b.charAt(i);
            
            if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
                countB++;
        }
        
        
        return (countA == countB)? true : false;
        
    }
}