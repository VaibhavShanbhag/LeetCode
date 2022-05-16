class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> wrds = new ArrayList<>();
        
        for(String str: words){
            wrds.add(str);
        }
        
        for(int i=1; i<wrds.size(); i++){
            String s1 = wrds.get(i);
            char[] c1 = s1.toCharArray();
            Arrays.sort(c1);
            String sorted1 = new String(c1);
            
            String s2 = wrds.get(i-1);
            char[] c2 = s2.toCharArray();
            Arrays.sort(c2);
            String sorted2 = new String(c2);
            
            if(sorted1.equals(sorted2)){
                wrds.remove(i);
                i--;
            }
        }
        
        for(int i=0; i<wrds.size(); i++){
            result.add(wrds.get(i));
        }
        
        return result;
        
    }
}