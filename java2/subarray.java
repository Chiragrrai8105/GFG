class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int a=0;
        for(int i=0;i<k;i++)
        {
            a+=arr[i];
        }
        int max=a;
        for(int i=k;i<arr.length;i++)
        {
            a=a+arr[i]-arr[i-k];
            if(max<a)
        {
            max=a;
        }
        } 
        
        return max;
    }       
}