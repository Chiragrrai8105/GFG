// User function Template for Java

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        int ar[]=new int[n];
        int br[]={0};
        if(n==1)
        {
            return br;
        }
        else
        {
            ar[0]=0;
            ar[1]=1;
            for(int i=2;i<n;i++)
            {
                ar[i]=ar[i-2]+ar[i-1];
            }
        }    
        return ar;
    }
}