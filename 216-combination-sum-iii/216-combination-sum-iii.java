class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        
        solve(1, n, k, res, new ArrayList<>());
        
        return res;
    }
    
    public void solve(int start, int n, int k, List<List<Integer>> res, List<Integer> temp){
        if(n == 0 && temp.size() == k){
            res.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=start; i<=9; i++){
            temp.add(i);
            solve(i+1, n-i, k, res, temp);
            temp.remove(temp.size() -1);
        }
    }
}