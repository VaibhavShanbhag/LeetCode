class Solution {
    public boolean digitCount(String num) {
        int n = num.length();
        Map<Integer, Integer> map = new HashMap<>();
        
        if(num.length() == 1 && num.charAt(0) != 0)
            return false;
        
        for(int i=0; i<n; i++){
            char ch = num.charAt(i);
            int n1 = ch - '0';
            map.put(n1,map.getOrDefault(n1,0)+1);
        }
        
        for(int i=0; i<n; i++){
            char ch = num.charAt(i);
            int n1 = ch - '0';
            
            if(map.containsKey(i) == true){
                if(map.get(i) != n1)
                    return false;
            }
            
            else if(n1 != 0)
                return false;
        }
        
        return true;
    }
}