class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        
        solve(1,k,n,new ArrayList<>(), res);
        
        return res;
    }
    
    public void solve(int start, int k, int n, List<Integer> temp, List<List<Integer>> res){
        if(temp.size() == k){
            res.add(new ArrayList<>(temp));
            return;
        }
        
         for(int i=start; i<=n; i++){
             temp.add(i);
             solve(i+1, k, n, temp, res);
             temp.remove(temp.size()-1);
         }
    }
}