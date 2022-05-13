// { Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


 // } Driver Code Ends
// Function to return Largest Number

class Solution
{
    public:
    //Function to return the largest possible number of n digits
    //with sum equal to given sum.
    string largestNumber(int n, int sum)
    {
        // Your code here
        string ans = "";
        while(n > 0 && sum > 0) {
            n--;
            if(sum >= 9) {
                sum -= 9;
                ans = ans + "9";
            } else {
                ans = ans + ((char)('0'+sum));
                sum = 0;
            }
        }
        if(sum > 0) return "-1";
        while(n--) ans = ans + "0";
        return ans;
    }
};

// { Driver Code Starts.
int main()
{
    //taking testcases
	int t;
	cin>>t;

	while(t--)
	{
	    //taking n and sum
		int n,sum;
		cin>>n>>sum;
		
        Solution obj;
        //function call
		cout<<obj.largestNumber(n, sum)<<endl;
	}
	return 0;
}  // } Driver Code Ends