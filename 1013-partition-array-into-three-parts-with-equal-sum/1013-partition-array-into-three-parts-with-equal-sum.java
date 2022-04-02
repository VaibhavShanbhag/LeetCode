class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int n = arr.length;
        int sum = 0;
        
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        
        int check = sum/3;
        int count = 0;
        int temp = 0;
        
        if(sum % 3 != 0)
            return false;
        
        for(int i=0; i<n; i++){
            temp += arr[i];
            
            if(temp == check){
                count++;
                temp = 0;
            }
        }
        
        if(count > 2)
            return true;
        
        return false;
        
    }
}