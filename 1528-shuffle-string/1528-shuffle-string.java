class Solution {
    public String restoreString(String s, int[] indices) {
        int n = indices.length;
        char[] temp = new char[n];
        char[] str = s.toCharArray();
        
        for(int i=0; i<n; i++){
            temp[indices[i]] = str[i];
        }
        
        return new String(temp);
    }
}