class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int n = s.length();        
        int[] res = new int[n];
        
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            
            if(ch == 'I'){
                res[i] = map.get(ch);
            }
            
            else if(ch == 'V'){
                res[i] = map.get(ch);
            }
            
            else if(ch == 'X'){
                res[i] = map.get(ch);
            }
            
            else if(ch == 'L'){
                res[i] = map.get(ch);
            }
            
            else if(ch == 'C'){
                res[i] = map.get(ch);
            }
            
            else if(ch == 'D'){
                res[i] = map.get(ch);
            }
            
            else{
                res[i] = map.get(ch);
            }
        }
        
        int sum = 0;
        
        for(int i=0; i<res.length-1; i++){
            if(res[i] < res[i+1]){
                sum -= res[i];
            }
            
            else{
                sum += res[i];
            }
        }
        
        return sum + res[res.length-1];
        
    }
}