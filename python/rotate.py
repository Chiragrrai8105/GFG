class Solution:
    def rotateArr(self, arr, d):
        d=d%len(arr)
        ans=[]
        idx=0
        for i in range(d,len(arr)):
            ans.append(arr[i])
        for j in range(d):
            ans.append(arr[j])
        for i in range(len(arr)):
            arr[i]=ans[i]
        return arr  

