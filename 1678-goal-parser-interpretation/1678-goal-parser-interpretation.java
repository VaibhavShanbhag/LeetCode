class Solution {
    public String interpret(String command) {
        String result = "";
        char[] str = command.toCharArray();
        
        for(int i=0; i<str.length-1; i++){
            if(str[i] == '(' && str[i+1] == ')'){
                result += 'o';
                i++;
            }
                
            else if(str[i] == '(' && str[i+1] != ')'){
                result += "al";
                i+=3;
            }
            
            else
                result += 'G';
        }
        
        if(str[str.length-1] == 'G')
          result += 'G';  
        
        return result;
    }
}