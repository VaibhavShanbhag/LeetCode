class Solution {
    public char repeatedCharacter(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        boolean[] fill_array = new boolean[26];
        Arrays.fill(fill_array, false);
        char ans = 0;
        
        for(int i=0; i<n; i++){
            if(fill_array[(int)arr[i] - 97] == false){
                fill_array[(int)arr[i] - 97] = true;
            }
            
            else{
                ans = arr[i];
                break;
            }
        }
        
        return ans;
        
    }
}