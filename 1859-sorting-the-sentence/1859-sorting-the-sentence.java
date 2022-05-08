class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] fin = new String[arr.length];
        
        for(String str: arr){
            int idx = (int)str.charAt(str.length() - 1) - '0';
            fin[idx - 1] = str.substring(0,str.length()-1);
        }
        
        String res = "";
        
        for(String str: fin){
            res = res + str + " ";
        }
        
        return res.substring(0, res.length()-1);
    }
}