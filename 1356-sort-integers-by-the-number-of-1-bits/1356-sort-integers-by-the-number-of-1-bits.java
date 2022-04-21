class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            arr[i] += countBits(arr[i]) * 10001;
        }
        
        Arrays.sort(arr);
        
        for(int i=0; i<n; i++){
            arr[i] %= 10001;
        }
        
        return arr;
    }
    
    public int countBits(int n){
        int step = 0;
        
        while(n != 0){
            step++;
            
            n = (n & (n-1));
        }
        
        return step;
    }
}