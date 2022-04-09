class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> row;
        
        for(int i=0; i<=rowIndex; i++){
            row = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j == 0 || j == i)
                    row.add(1);
                
                else{
                    row.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
                }
            }
            
            ans.add(row);
        }
        
        return ans.get(rowIndex);
    }
}