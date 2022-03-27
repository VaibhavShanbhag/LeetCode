class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> n1 = new HashSet<>();
        HashSet<Integer> n2 = new HashSet<>();
        
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i=0; i<nums1.length; i++)
            n1.add(nums1[i]);
        
        for(int i=0; i<nums2.length; i++)
            n2.add(nums2[i]);
        
        ArrayList<Integer> a = new ArrayList<>();
        for(int v: n1){
            if(!n2.contains(v)){
                a.add(v);
            }
        }
        
        ArrayList<Integer> b = new ArrayList<>();
        for(int v: n2){
            if(!n1.contains(v)){
                b.add(v);
            }
        }
        
        result.add(a);
        result.add(b);
        
        return result;
            
    }
}