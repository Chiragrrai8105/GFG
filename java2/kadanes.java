class Solution:
    def maxSubarraySum(self, arr):
        # Code here
        t=0;
        maxp=arr[0]
        for i in range(len(arr)):
            t+=arr[i];
            maxp=max(maxp,t)
            if t<0:
                t=0
        return maxp    
            