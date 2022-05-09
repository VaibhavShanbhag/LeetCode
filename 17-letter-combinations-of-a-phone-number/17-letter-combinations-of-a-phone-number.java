class Solution {
    
    Map<Character, String> keypadValues = new HashMap<Character, String>();
    ArrayList<String> result = new ArrayList<String>();
    
    public List<String> letterCombinations(String digits) {
        
        if(digits.length() == 0)
            return result;
        
        String output = "";
        int index = 0;
        
        keypadValues.put('2',"abc");
        keypadValues.put('3',"def");
        keypadValues.put('4',"ghi");
        keypadValues.put('5',"jkl");
        keypadValues.put('6',"mno");
        keypadValues.put('7',"pqrs");
        keypadValues.put('8',"tuv");
        keypadValues.put('9',"wxyz");
        
        possibleWordsCombination(digits, index, output);
        
        return result;
    }
    
     public void possibleWordsCombination(String arr, int index, String output){
        if(index >= arr.length()){
            result.add(output);
            return;
        }
        
        String temp = keypadValues.get(arr.charAt(index));
        
        for(int i=0; i<temp.length(); i++){
            possibleWordsCombination(arr, index+1, output+temp.charAt(i));
        }
    }
}