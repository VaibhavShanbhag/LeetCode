class Solution {
    public List<String> commonChars(String[] words) {
        int n = words.length;
        List<String> result = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<words[0].length(); i++){
            char ch = words[0].charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        
        for(int i=1; i<words.length; i++){
            Map<Character, Integer> temp = new HashMap<>();
            
            for(int j=0; j<words[i].length(); j++){
                char ch = words[i].charAt(j);
                
                if(map.containsKey(ch))
                    temp.put(ch, Math.min(map.get(ch), temp.getOrDefault(ch,0)+1));
            }
            
            map = temp;
        }
        
        for(char ch: map.keySet()){
            for(int i=0; i<map.get(ch); i++)
                result.add(ch + "");
        }
        
        return result;
        
        
    }
}