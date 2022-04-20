class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        Map<Character, Character> smap = new HashMap<>();
        Map<Character, Character> tmap = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            char sh = s.charAt(i);
            char th = t.charAt(i);
            
            if(smap.containsKey(sh)){
                if(smap.get(sh) != th)
                    return false;
            }
            
            if(tmap.containsKey(th)){
                if(tmap.get(th) != sh)
                    return false;
            }
            
            smap.put(sh,th);
            tmap.put(th,sh);
        }
        
        return true;
    }
}