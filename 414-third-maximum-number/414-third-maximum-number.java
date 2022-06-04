class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for(int ele: nums){
            set.add(ele);
        }
        
        Integer[] arr = set.toArray(new Integer[0]);
        
        Arrays.sort(arr);
        
        if(arr.length < 3)
            return arr[arr.length-1];
        
        return arr[arr.length-3];
    }
}