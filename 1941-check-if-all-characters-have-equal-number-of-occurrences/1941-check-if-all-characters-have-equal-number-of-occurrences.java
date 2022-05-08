class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        int ansKey = map.get(s.charAt(0));
        
        for(Character key: map.keySet()){
            if(map.get(key) != ansKey)
                return false;
            
            else
                continue;
        }
        
        return true;
    }
}