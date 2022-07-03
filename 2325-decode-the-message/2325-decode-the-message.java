class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        char value = 'a';
        
        for(char ch : key.toCharArray()){
            if(ch == ' ')
                continue;
            
            else{
                if(!(map.containsKey(ch))){
                    map.put(ch,value);
                    value += 1;
                }
                
                else{
                    continue;
                }
            }
        }
        
        String result = "";
        
        for(char ch: message.toCharArray()){
            
            if(ch != ' '){
                char val = map.get(ch);
                result += val;
                
            }
            
            else{
                result += " ";
            }
        }
        
        return result;
        
    }
}