class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        boolean flag = false;
        
        
        for(int i=0; i<m; i++){
            flag = binarySearch(matrix[i],target);
            
            if(flag)
                return true;
        }
        
        return false;
    }
    
    private boolean binarySearch(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        
        
        while(low <= high){
            int mid = (low+high)/2;
            
            if(arr[mid] == target)
                return true;
            
            else if(arr[mid] > target)
                high = mid - 1;
            
            else
                low = mid + 1;   
        }
        
        return false;
    }
}