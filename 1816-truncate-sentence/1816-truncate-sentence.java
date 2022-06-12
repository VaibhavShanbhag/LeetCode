class Solution {
    public String truncateSentence(String s, int k) {
        String[] str = s.split(" ");
        String res = "";
        
        for(int i=0; i<k; i++){
            res = res + str[i] + " ";
        }
        
        return res.substring(0, res.length()-1);
    }
}