class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a =  s.toCharArray();
        char[] b =  t.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        String c = new String(a);
        String d = new String(b);
        
        if(c.equals(d))
            return true;
        
        else
            return false;     
        
//         char ch = 0;
        
//         for(char a: s.toCharArray()){
//             ch ^= a;
//         }
        
//         for(char a: t.toCharArray()){
//             ch ^= a;
//         }
        
//         if(ch == 0)
//             return true;
        
//         return false; 
        
    }
}