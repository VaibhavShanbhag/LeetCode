class Solution {
    private ArrayList<Integer> list = new ArrayList<>();
    
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        
        Arrays.sort(arr1);
        
        for(int ele: arr1){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        
        for(int ele: arr2){
            a2.add(ele);
        }
        
        for(int i=0; i<arr2.length; i++){
            int count = map.get(arr2[i]);
            addElem(arr2[i],count);
        }
        
        for(int ele: arr1){
            if(!a2.contains(ele)){
                list.add(ele);
            }
        }
        
        int[] res = new int[list.size()];
        int k = 0;
        
        for(int i=0; i<list.size(); i++){
            res[k++] = list.get(i);
        }
        
        return res;
        
    }
    
    private void addElem(int element, int count){
        for(int i=1; i<=count; i++){
            list.add(element);
        }
        
        return;
    }
}