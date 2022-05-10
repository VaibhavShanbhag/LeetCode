class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        
        solve(0, candidates, target, res, new ArrayList<>());
        
        return res;
    }
    
    public void solve(int start, int[] candidates, int target, List<List<Integer>> res, List<Integer> list){
        if(target == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        
        if(target > 0){
            for(int i= start; i<candidates.length; i++){
                if(i > start && candidates[i] == candidates[i-1]) continue;
                
                list.add(candidates[i]);
                solve(i+1, candidates, target - candidates[i], res, list);
                list.remove(list.size()-1);
            }
        }
    }
}