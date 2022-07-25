class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] res = {-1,-1};
        int low = 0;
        int high = arr.length - 1;
        int mid;
        
        while(low <= high){
            mid = (low + high)/2;
            
            if(arr[mid] == target){
                res[0] = mid;
                high = mid - 1;
            }
            
            else if(arr[mid] < target){
                low = mid + 1;
            }
            
            else{
                high = mid - 1;
            }
        }
        
        low = 0;
        high = arr.length-1;
        
        while(low <= high){
            mid = (low + high)/2;
            
            if(arr[mid] == target){
                res[1] = mid;
                low = mid + 1;
            }
            
            else if(arr[mid] < target){
                low = mid + 1;
            }
            
            else{
                high = mid - 1;
            }
        }
        
        return res;
    }
}