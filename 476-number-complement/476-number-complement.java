class Solution {
    public int findComplement(int num) {
        if(num == 1)
            return 0;
        
        int size = (int) (Math.log(num)/Math.log(2) + 1);
        int[] arr = new int[size];
        int k = 0;
        
        while(num != 0){
            int r = num % 2;
            arr[k++] = r;
            num /= 2;
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0)
                arr[i] = 1;
            
            else
                arr[i] = 0;
        }
        
        int ans = 0;
        for(int i=arr.length-1; i>=0; i--){
           ans = 2 * ans + arr[i];
        }
        
        return ans;
        
    }
}