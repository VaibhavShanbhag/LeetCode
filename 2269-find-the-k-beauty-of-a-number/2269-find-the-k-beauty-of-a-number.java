class Solution {
    public int divisorSubstrings(int num, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        
        String str = Integer.toString(num);
        int n = str.length();
        
        for(int i=0; i<n; i++){
            if((n - i) >= k){
                String s = str.substring(i, i+k);
                res.add(Integer.parseInt(s));
            }
        }
        
        int count = 0;
        
        for(int i=0; i<res.size(); i++){
            if(res.get(i) != 0 && num % res.get(i) == 0)
                count++;
        }
        
        return count;
    }
}