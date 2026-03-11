class Solution:
    def thirdLargest(self,arr):
        arr.sort()
        return arr[len(arr)-3]