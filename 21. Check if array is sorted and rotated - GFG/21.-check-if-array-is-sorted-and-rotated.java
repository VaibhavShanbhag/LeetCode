// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;


 // } Driver Code Ends

class Solution{    
    
    // arr[]: input array
    // num: size of array
    // Function to check if array is sorted and rotated
    public static boolean checkRotatedAndSorted(int arr[], int n){
        
        // Your code here
        
        int res = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++){
            if(arr[i] < min){
                res = i;
                min = arr[i];
            }
        }
        
        if(isIncreasing(arr,res,n-1) && isIncreasing(arr,0,res-1) && arr[0] > arr[n-1])
        return true;
        
        if(isDecreasing(arr,res+1,n-1) && isDecreasing(arr,0,res-1) && arr[0] < arr[n-1])
        return true;
        
        return false;
    }
    
    public static boolean isIncreasing(int[] arr, int start, int end){
        for(int i=start; i<end; i++){
            if(arr[i] > arr[i+1])
            return false;
        }
        
        return true;
    }
    
    public static boolean isDecreasing(int[] arr, int start, int end){
        for(int i=start; i<end; i++){
            if(arr[i] < arr[i+1])
            return false;
        }
        
        return true;
    }
    
}




// { Driver Code Starts.

class Main {
    
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine()); // input size of array
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split("\\s+");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
		    }
		   
		 Solution obj = new Solution();
        
        if(!(obj.checkRotatedAndSorted(arr, n)))
            System.out.println("No"); // print the result
        else
            System.out.println("Yes");
		}
	}
}
  // } Driver Code Ends