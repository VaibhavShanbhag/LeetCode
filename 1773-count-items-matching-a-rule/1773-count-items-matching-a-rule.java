class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int n = items.size();
        int count = 0;
        int indexRuleKey = 0;
        
        if(ruleKey.equals("type"))
            indexRuleKey = 0;
        
        else if(ruleKey.equals("color"))
            indexRuleKey = 1;
        
        else
            indexRuleKey = 2;
        
        for(int i=0; i<n; i++){
            if(items.get(i).get(indexRuleKey).equals(ruleValue))
                count++;
        }
        
        return count;
    }
}